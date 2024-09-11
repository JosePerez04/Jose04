package alumno;

public class Alumno {
    
    String nombre;
    String apellidos;
    String edad;
    String area;
    String semestre;

    public Alumno(String nombre, String apellidos, String edad, String area, String semestre) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.area = area;
        this.semestre = semestre;
    }

    public Alumno() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
    
}
