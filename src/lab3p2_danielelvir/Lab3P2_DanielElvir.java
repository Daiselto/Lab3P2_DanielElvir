
package lab3p2_danielelvir;

import java.util.Scanner;
public class Lab3P2_DanielElvir {
    static Scanner leer = new Scanner(System.in);
    static Scanner read = new Scanner(System.in);
    
  
    public static void main(String[] args) {
        boolean seguir=true;
        while (seguir) {            
            System.out.println("Bienvenido al Registro Vehicular");
            System.out.println("1. Agregar Automovil");
            System.out.println("2. Agregar Motocicleta");
            System.out.println("3. Agregar Autobus");
            System.out.println("4. Modificar Vehiculo");
            System.out.println("5. Eliminar Vehiculo");
            System.out.println("6. Mostrar Vehiculos");
            System.out.println("7. Generar Boleta");
            System.out.println("8. Salir de Registro");
            String opcion=read.nextLine();
            
            switch(opcion){
                case "1":{
                    System.out.println("En construcción");
                    break;
                }
                
                case "2":{
                   System.out.println("En construcción");
                    break;
                }
                
                case "3":{
                   System.out.println("En construcción");
                    break;
                }
                
                case "4":{
                   System.out.println("En construcción");
                    break;
                }
                
                case "5":{
                   System.out.println("En construcción");
                    break;
                }
                
                case "6":{
                   System.out.println("En construcción");
                    break;
                }
                
                case "7":{
                   System.out.println("En construcción");
                    break;
                }
                
                case "8":{
                   seguir=false;
                    System.out.println("Gracias por usar el sistema de registro");
                    break;
                }
                
                default:{
                    System.out.println("Ingrese una opción valida por favor");
                    break;
                }
                
            }
        }
    }
    
}
