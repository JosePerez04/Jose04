package herencia;

public class Vehiculo1 {
    private String fechaFabricacion;
    private String vinChasis;
    private String vinMotor;

    public Vehiculo1(String fechaFabricacion, String vinChasis, String vinMotor) {
        this.fechaFabricacion = fechaFabricacion;
        this.vinChasis = vinChasis;
        this.vinMotor = vinMotor;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public String getVinChasis() {
        return vinChasis;
    }

    public String getVinMotor() {
        return vinMotor;
    }
}

