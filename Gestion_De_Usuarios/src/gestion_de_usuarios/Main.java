
//Trabajo de programacion :)

package gestion_de_usuarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        GestorUsuarios gestor = new GestorUsuarios();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Buscar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");

            System.out.print("Ingrese una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    
                    System.out.print("Ingrese el nombre completo: ");
                    String nombreCompleto = scanner.nextLine();
                    System.out.print("Ingrese el nickname: ");
                    String nickname = scanner.nextLine();
                    System.out.print("Ingrese la clave: ");
                    String clave = scanner.nextLine();
                    System.out.print("Ingrese el tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese la fecha de creación: ");
                    String fechaCreacion = scanner.nextLine();

                    Usuario nuevoUsuario = new Usuario(nombreCompleto, nickname, clave, tipo, fechaCreacion);
                    gestor.agregarUsuario(nuevoUsuario);
                    break;

                case "2":
                    System.out.print("Ingrese el valor a buscar: ");
                    String valorBuscar = scanner.nextLine();
                    System.out.println("Resultado de la búsqueda: " + gestor.buscarUsuario(valorBuscar));
                    break;

                case "3":
                    System.out.print("Ingrese el valor a eliminar: ");
                    String valorEliminar = scanner.nextLine();
                    System.out.println(gestor.eliminarUsuario(valorEliminar));
                    break;

                case "4":
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}


