package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuarios {

    private String nombre;
    private String email;
    private String username;
    private String clave;

    
    public Usuarios() {}

    
    public Usuarios(String nombre, String email, String username, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.clave = clave;
    }

    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    
    public boolean verificarCredenciales(String pUsername, String pPassword) {
        Conector db = new Conector();
        boolean valido = false;

        String query = "SELECT * FROM usuarios WHERE username = ? AND clave = ?";
        
        try {
            db.conectar();
            try (PreparedStatement pst = db.getConexion().prepareStatement(query)) { // Corrección aquí
                pst.setString(1, pUsername);
                pst.setString(2, pPassword);
                
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        valido = true;
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("❌ Error al verificar credenciales: " + e.getMessage());
        } finally {
            db.desconectar();
        }
        return valido;
    }

    
    public boolean registrarUsuario() {
        Conector db = new Conector();
        boolean registrado = false;

        String query = "INSERT INTO usuarios (nombre, email, username, clave) VALUES (?, ?, ?, ?)";
        
        try {
            db.conectar();
            try (PreparedStatement pst = db.getConexion().prepareStatement(query)) { 
                pst.setString(1, this.nombre);
                pst.setString(2, this.email);
                pst.setString(3, this.username);
                pst.setString(4, this.clave);
                
                int filasAfectadas = pst.executeUpdate();
                if (filasAfectadas > 0) {
                    registrado = true;
                }
            }
        } catch (SQLException e) {
            System.err.println("❌ Error al registrar usuario: " + e.getMessage());
        } finally {
            db.desconectar();
        }
        return registrado;
    }
}


