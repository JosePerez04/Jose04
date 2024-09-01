package sistema_empleados;

public class Empleado extends Persona {
    private String nombreCargo;
    private double salario;
    private String jefeInmediato;
    private int anosExperiencia;

    
    public String getNombreCargo() { return nombreCargo; }
    public void setNombreCargo(String nombreCargo) { this.nombreCargo = nombreCargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getJefeInmediato() { return jefeInmediato; }
    public void setJefeInmediato(String jefeInmediato) { this.jefeInmediato = jefeInmediato; }

    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anosExperiencia) { this.anosExperiencia = anosExperiencia; }

    
    public void determinarCargo() {
        if (salario >= 5000000 && anosExperiencia >= 5 && getEdad() >= 25 && getEdad() <= 45) {
            nombreCargo = "Senior";
        } else if (salario >= 900000 && salario <= 1200000 && anosExperiencia >= 1 && anosExperiencia <= 2 && getEdad() >= 18 && getEdad() <= 22) {
            nombreCargo = "Junior";
        } else {
            nombreCargo = "No determinado";
        }
    }

    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Edad: " + getEdad());
        System.out.println("Email: " + getEmail());
        System.out.println("Salario: " + getSalario());
        System.out.println("Jefe Inmediato: " + getJefeInmediato());
        System.out.println("Años de Experiencia: " + getAnosExperiencia());
        System.out.println("Cargo: " + getNombreCargo());
    }
}
