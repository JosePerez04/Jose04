package personas;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Persona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> personas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Crear persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Listar personas");
            System.out.println("4. Buscar persona");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    personas.add(nombre);
                    System.out.println("Lista actual: " + personas);
                    break;
                case 2:
                    System.out.println("Lista actual de personas: " + personas);
                    System.out.print("Ingrese el índice de la persona a eliminar: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();  
                    if (indice >= 0 && indice < personas.size()) {
                        personas.remove(indice);
                        System.out.println("Lista actual: " + personas);
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de personas: " + personas);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la persona a buscar: ");
                    String busqueda = scanner.nextLine();
                    if (personas.contains(busqueda)) {
                        System.out.println("Persona encontrada.");
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
