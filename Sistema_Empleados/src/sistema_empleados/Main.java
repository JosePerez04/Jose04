
//Parcial de Programción :)
package sistema_empleados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = new Empleado();

        
        System.out.print("Ingrese nombre: ");
        empleado.setNombre(scanner.nextLine());

        System.out.print("Ingrese apellido: ");
        empleado.setApellido(scanner.nextLine());

        System.out.print("Ingrese dirección: ");
        empleado.setDireccion(scanner.nextLine());

        System.out.print("Ingrese teléfono: ");
        empleado.setTelefono(scanner.nextLine());

        System.out.print("Ingrese edad: ");
        empleado.setEdad(scanner.nextInt());

        System.out.print("Ingrese email: ");
        scanner.nextLine(); 
        empleado.setEmail(scanner.nextLine());

        System.out.print("Ingrese salario: ");
        empleado.setSalario(scanner.nextDouble());

        System.out.print("Ingrese jefe inmediato: ");
        scanner.nextLine(); 
        empleado.setJefeInmediato(scanner.nextLine());

        System.out.print("Ingrese años de experiencia: ");
        empleado.setAnosExperiencia(scanner.nextInt());

        
        empleado.determinarCargo();

        
        imprimirDetalles(empleado);

        scanner.close();
    }

    
    public static void imprimirDetalles(Empleado empleado) {
        empleado.imprimirDetalles();
    }
}



