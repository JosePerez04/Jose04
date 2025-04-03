package Clases;

import java.sql.*;

public class Conector {
    
    private static final String URL = "jdbc:mysql://localhost/sistema_usuarios";
    private static final String USER = "root";
    private static final String PASSWORD = "J@seD@vid240421";
    private Connection connection;

    
    public Conector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el driver de MySQL
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        }
    }

    
    public void conectar() {
        try {
            if (this.connection == null || this.connection.isClosed()) {
                this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Conexión exitosa a la base de datos.");
            }
        } catch (SQLException ex) {
            System.err.println("❌ Error al conectar a la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    
    public void desconectar() {
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
                System.out.println("🔌 Desconexión exitosa de la base de datos.");
            }
        } catch (SQLException ex) {
            System.err.println("❌ Error al desconectar de la base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    
    public ResultSet executeSelect(String query, Object... parameters) throws SQLException {
        PreparedStatement statement = prepareStatement(query, parameters);
        return statement.executeQuery(); 
    }

   
    public int executeUpdate(String query, Object... parameters) throws SQLException {
        try (PreparedStatement statement = prepareStatement(query, parameters)) {
            return statement.executeUpdate();
        }
    }

    
    private PreparedStatement prepareStatement(String query, Object... parameters) throws SQLException {
        if (this.connection == null || this.connection.isClosed()) {
            conectar(); // Asegurar conexión
        }
        PreparedStatement statement = this.connection.prepareStatement(query);
        for (int i = 0; i < parameters.length; i++) {
            statement.setObject(i + 1, parameters[i]);
        }
        return statement;
    }

    
    public Connection getConexion() {
        if (this.connection == null || !isConnectionActive()) {
            conectar();
        }
        return this.connection;
    }

    
    private boolean isConnectionActive() {
        try {
            return this.connection != null && !this.connection.isClosed();
        } catch (SQLException ex) {
            return false;
        }
    }
}



