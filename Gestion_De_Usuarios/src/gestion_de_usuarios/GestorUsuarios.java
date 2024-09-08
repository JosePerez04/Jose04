package gestion_de_usuarios;

import java.util.ArrayList;

public class GestorUsuarios {
    private ArrayList<Usuario> usuarios;

    
    public GestorUsuarios() {
        usuarios = new ArrayList<>();
    }

    
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado con éxito.");
    }

    
    public String buscarUsuario(String valor) {
        for (Usuario usuario : usuarios) {
            if (usuario.contieneValor(valor)) {
                return usuario.getDatos();
            }
        }
        return "Usuario no encontrado";
    }

    
    public String eliminarUsuario(String valor) {
        for (Usuario usuario : usuarios) {
            if (usuario.contieneValor(valor)) {
                usuarios.remove(usuario);
                return "Usuario eliminado";
            }
        }
        return "Usuario no encontrado";
    }
}

