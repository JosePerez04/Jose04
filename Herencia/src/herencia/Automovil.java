package herencia;

public class Automovil extends Vehiculo1 {
    private String marca;
    private String modelo;
    private double precio;

    public Automovil(String fechaFabricacion, String vinChasis, String vinMotor, String marca, String modelo, double precio) {
        super(fechaFabricacion, vinChasis, vinMotor);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDatos() {
        System.out.println("Datos del Automóvil:");
        System.out.println("Fecha de Fabricación: " + getFechaFabricacion());
        System.out.println("VIN del Chasis: " + getVinChasis());
        System.out.println("VIN del Motor: " + getVinMotor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
    }
}


