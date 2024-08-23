
package condicionales;

import java.util.Scanner;


public class Condicionales {

   
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
         System.out.println("Didite una opcion: ");
       
        int opcion = entrada.nextInt();
        
        
        
        if(opcion >0 && opcion <=5){
            
           System.out.println("Es una opcion valida");
           
          
        }else{
            System.out.println("No es una opcion valida");
            
       
        }
        
        
        
        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es una opción válida");
                break;
            default:
                System.out.println("No es una opción válida");
                break;
                
        }
          
    }
    
}
