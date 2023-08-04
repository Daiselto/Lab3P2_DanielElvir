package lab3p2_danielelvir;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab3P2_DanielElvir {

    static Scanner leer = new Scanner(System.in);
    static Scanner read = new Scanner(System.in);
    static ArrayList<Vehiculo> Vehiculo = new ArrayList();

    public static void main(String[] args) throws ParseException {
        boolean seguir = true;
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
            String opcion = read.nextLine();

            switch (opcion) {
                case "1": {
                    System.out.println("Ingrese la placa del Automovil");
                    System.out.println("Recuerde el formato de 3 caracteres y 4 digitos");
                    String placa=read.nextLine();
                    System.out.println("Ingrese la Marca del Automovil");
                    String marca=read.nextLine();
                    System.out.println("Ingrese el tipo del Automovil");
                    String tipo=read.nextLine();
                    System.out.println("Ingrese el color del Automovil");
                    Color color=color=JColorChooser.showDialog(null, "Seleccione un color", Color.WHITE);
                    DateFormat df = new SimpleDateFormat("yyyy");
                    System.out.println("Ingrese el año del Vehiculo");
                    String añostr=read.nextLine();
                    Date año=df.parse(añostr);
                    System.out.println("Ingrese el tipo de Combustible");
                    String tipoCombustible=read.nextLine();
                    System.out.println("Ingrese la cantidad de puertas");
                    int puertas=leer.nextInt();
                    System.out.println("Ingrese el tipo de Transmision");
                    String transmision=read.nextLine();
                    System.out.println("Ingrese el numero de asientos");
                    int numAsientos=leer.nextInt();
                    
                    Vehiculo.add(new Automovil(tipoCombustible, transmision, puertas, numAsientos, placa, marca, tipo, tipo, color, año));
                    System.out.println("Automovil agregado exitosamente");
                    break;
                }

                case "2": {
                    System.out.println("En construcción");
                    break;
                }

                case "3": {
                    System.out.println("En construcción");
                    break;
                }

                case "4": {
                    System.out.println("En construcción");
                    break;
                }

                case "5": {
                    System.out.println("En construcción");
                    break;
                }

                case "6": {
                    System.out.println("En construcción");
                    break;
                }

                case "7": {
                    System.out.println("En construcción");
                    break;
                }

                case "8": {
                    seguir = false;
                    System.out.println("Gracias por usar el sistema de registro");
                    break;
                }

                default: {
                    System.out.println("Ingrese una opción valida por favor");
                    break;
                }

            }
        }
    }

}
