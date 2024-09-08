package gestion_de_usuarios;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    
    Map<String, String> datos;

    
    public Usuario(String nombreCompleto, String nickname, String clave, String tipo, String fechaCreacion) {
        datos = new HashMap<>();
        datos.put("nombre_completo", nombreCompleto);
        datos.put("nickname", nickname);
        datos.put("clave", clave);
        datos.put("tipo", tipo);
        datos.put("fecha_creacion", fechaCreacion);
    }

    
    public String getDatos() {
        return datos.toString();
    }

    
    public boolean contieneValor(String valor) {
        return datos.containsValue(valor);
    }
}
