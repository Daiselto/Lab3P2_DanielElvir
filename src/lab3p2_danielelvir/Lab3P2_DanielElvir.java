package lab3p2_danielelvir;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Lab3P2_DanielElvir {

    static Scanner leer = new Scanner(System.in);
    static Scanner read = new Scanner(System.in);
    static ArrayList<Vehiculo> Vehiculo = new ArrayList();

    public static void main(String[] args) throws ParseException {
        boolean seguir = true;
        while (seguir) {
            read = new Scanner(System.in);
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
                    String placa = read.next();
                    if (placa.length() > 0 && placa.length() < 7) {
                        System.out.println("La placa es muy larga");
                        break;
                    }

                    if (placa.charAt(0) != 'H') {
                        System.out.println("La placa debe iniciar con H");
                        break;
                    }

                    if (!validarPlaca(placa)) {
                        System.out.println("No ingresó el formato especifico");
                        break;
                    }

                    if (existePlaca(placa)) {
                        System.out.println("La placa ya está registrada, ingrese una nueva placa");
                        break;
                    }

                    System.out.println("Ingrese la Marca del Automovil");
                    String marca = read.next();
                    System.out.println("Ingrese el Modelo del Automovil");
                    String modelo = read.next();
                    System.out.println("Ingrese el tipo del Automovil");
                    String tipo = read.next();
                    System.out.println("Ingrese el color del Automovil");
                    Color color = color = JColorChooser.showDialog(null, "Seleccione un color", Color.WHITE);
                    DateFormat df = new SimpleDateFormat("yyyy");
                    System.out.println("Ingrese el año del Vehiculo");
                    String añostr = read.next();
                    if (añostr.length() >= 0 && añostr.length() < 4) {
                        System.out.println("El tamaño del año no es el correcto");
                        break;
                    }
                    Date año = df.parse(añostr);
                    System.out.println("Ingrese el tipo de Combustible");
                    String tipoCombustible = read.next();
                    System.out.println("Ingrese la cantidad de puertas");
                    int puertas = leer.nextInt();
                    System.out.println("Ingrese el tipo de Transmision");
                    String transmision = read.next();
                    System.out.println("Ingrese el numero de asientos");
                    int numAsientos = leer.nextInt();

                    Vehiculo.add(new Automovil(tipoCombustible, transmision, puertas, numAsientos, placa, marca, modelo, tipo, color, año));
                    System.out.println("Automovil agregado exitosamente");
                    break;
                }

                case "2": {
                    System.out.println("Ingrese la placa de la Motocicleta");
                    System.out.println("Recuerde el formato de 3 caracteres y 4 digitos");
                    String placa = read.nextLine();
                    if (placa.length() > 0 && placa.length() < 7) {
                        System.out.println("La placa es muy larga");
                        break;
                    }

                    if (placa.charAt(0) != 'B') {
                        System.out.println("La placa debe iniciar con B");
                        break;
                    }

                    if (!validarPlaca(placa)) {
                        System.out.println("No ingresó el formato especifico");
                        break;
                    }

                    if (existePlaca(placa)) {
                        System.out.println("La placa ya está registrada, ingrese una nueva placa");
                        break;
                    }
                    System.out.println("Ingrese la Marca de la Motocicleta");
                    String marca = read.next();
                    System.out.println("Ingrese el Modelo del Motocicleta");
                    String modelo = read.next();
                    System.out.println("Ingrese el tipo de la Motocicleta");
                    String tipo = read.next();
                    System.out.println("Ingrese el color de la Motocicleta");
                    Color color = color = JColorChooser.showDialog(null, "Seleccione un color", Color.WHITE);
                    DateFormat df = new SimpleDateFormat("yyyy");
                    System.out.println("Ingrese el año del la Motocicleta");
                    String añostr = read.next();
                    Date año = df.parse(añostr);
                    System.out.println("Ingrese la velocidad maxima de la motocicleta en Km/h");
                    double velocidad = leer.nextDouble();
                    System.out.println("Ingrese el peso de la motocicleta en KG");
                    double peso = leer.nextDouble();
                    System.out.println("Ingrese el consumo del combustible en L/Km");
                    double Consumo = leer.nextDouble();

                    Vehiculo.add(new Motocicleta(velocidad, peso, Consumo, placa, marca, modelo, tipo, color, año));
                    System.out.println("Motocicleta agregada exitosamente");
                    break;
                }

                case "3": {
                    System.out.println("Ingrese la placa del Autobus");
                    System.out.println("Recuerde el formato de 3 caracteres y 4 digitos");
                    String placa = read.next();
                    if (placa.length() > 0 && placa.length() < 7) {
                        System.out.println("La placa es muy larga");
                        break;
                    }

                    if (placa.charAt(0) != 'H') {
                        System.out.println("La placa debe iniciar con H");
                        break;
                    }

                    if (!validarPlaca(placa)) {
                        System.out.println("No ingresó el formato especifico");
                        break;
                    }

                    if (existePlaca(placa)) {
                        System.out.println("La placa ya está registrada, ingrese una nueva placa");
                        break;
                    }
                    System.out.println("Ingrese la Marca del Autobus");
                    String marca = read.next();
                    System.out.println("Ingrese el Modelo del Autobus");
                    String modelo = read.next();
                    System.out.println("Ingrese el tipo del Autobus");
                    String tipo = read.next();
                    System.out.println("Ingrese el color del Autobus");
                    Color color = color = JColorChooser.showDialog(null, "Seleccione un color", Color.WHITE);
                    DateFormat df = new SimpleDateFormat("yyyy");
                    System.out.println("Ingrese el año del Autobus");
                    String añostr = read.next();
                    Date año = df.parse(añostr);
                    System.out.println("Ingrese la Capacidad de pasajeros que puede llevar el autobus");
                    int capacidad = leer.nextInt();
                    System.out.println("Ingrese la cantidad de ejes que tiene el autobus");
                    int ejes = leer.nextInt();
                    System.out.println("Ingrese la longitud en metros del autobus");
                    double longitud = leer.nextDouble();

                    Vehiculo.add(new Autobus(capacidad, ejes, longitud, placa, marca, modelo, tipo, color, año));
                    break;
                }

                case "4": {
                    if (Vehiculo.isEmpty()) {
                        System.out.println("Debe agregar CUALQUIER vehiculo para modificarlos");
                        break;
                    } else {
                        System.out.println("Así se ve la lista de Vehiculos actualmente");
                        int i = 1;

                        for (Vehiculo vehiculo : Vehiculo) {
                            System.out.println(i + ". " + infoVehiculo(vehiculo));
                            i++;
                        }
                        System.out.println("Escoja el vehiculo que desea modificar");
                        int index = leer.nextInt();
                        if (index >= 1 && index <= Vehiculo.size()) {
                            if (seguir) {
                                Vehiculo vehic = Vehiculo.get(index - 1);
                                System.out.println("Atributos de el vehiculo seleccionado");
                                System.out.println(vehic.toString());

                                if (vehic instanceof Automovil) {
                                    System.out.println("Escoja que desea cambiar del Automovil");
                                    System.out.println("1. Placa");
                                    System.out.println("2. Marca");
                                    System.out.println("3. Modelo");
                                    System.out.println("4. Tipo");
                                    System.out.println("5. Color");
                                    System.out.println("6. Año");
                                    System.out.println("7. Tipo de Combustible");
                                    System.out.println("8. Puertas");
                                    System.out.println("9. Tipo Transmision");
                                    System.out.println("10. Asientos");
                                    int opcion1 = read.nextInt();

                                    switch (opcion1) {
                                        case 1: {
                                            System.out.println("Ingrese la nueva placa");
                                            String placa = read.next();
                                            ((Automovil) Vehiculo.get(index - 1)).setPlaca(placa);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Ingrese la nueva marca");
                                            String marca = read.next();
                                            ((Automovil) Vehiculo.get(index - 1)).setMarca(marca);
                                            break;
                                        }

                                        case 3: {
                                            System.out.println("Ingrese el nuevo modelo");
                                            String modelo = read.next();
                                            ((Automovil) Vehiculo.get(index - 1)).setModelo(modelo);
                                            break;
                                        }

                                        case 4: {
                                            System.out.println("Ingrese el nuevo tipo");
                                            String tipo = read.next();
                                            ((Automovil) Vehiculo.get(index - 1)).setTipo(tipo);
                                            break;
                                        }

                                        case 5: {
                                            System.out.println("Ingrese el nuevo color");
                                            Color color = color = JColorChooser.showDialog(null, "Seleccione un color", Color.WHITE);
                                            ((Automovil) Vehiculo.get(index - 1)).setColor(color);
                                            break;
                                        }

                                        case 6: {
                                            DateFormat df = new SimpleDateFormat("yyyy");
                                            System.out.println("Ingrese el nuevo año");
                                            String añostr = read.next();
                                            Date año = df.parse(añostr);
                                            ((Automovil) Vehiculo.get(index - 1)).setAño(año);
                                            break;
                                        }

                                        case 7: {
                                            System.out.println("Ingrese el nuevo tipo de combustible");
                                            String tipo = read.next();
                                            ((Automovil) Vehiculo.get(index - 1)).setTipoCombustible(tipo);
                                            break;
                                        }

                                        case 8: {
                                            System.out.println("Ingrese las nuevas puertas");
                                            int puertas = leer.nextInt();
                                            ((Automovil) Vehiculo.get(index - 1)).setNumPuertas(puertas);
                                            break;
                                        }

                                        case 9: {
                                            System.out.println("Ingrese la nueva transmision");
                                            String transmision = read.next();
                                            ((Automovil) Vehiculo.get(index - 1)).setTipoTransmision(transmision);
                                        }

                                        case 10: {
                                            System.out.println("Ingrese los nuevos asientos");
                                            int asientos = leer.nextInt();
                                            ((Automovil) Vehiculo.get(index - 1)).setNumAsiento(asientos);
                                            break;
                                        }

                                        default: {
                                            System.out.println("Ingrese una opción valida por favor");
                                            break;
                                        }
                                    }
                                } else if (vehic instanceof Motocicleta) {
                                    System.out.println("Escoja que desea cambiar de la Motocicleta");
                                    System.out.println("1. Placa");
                                    System.out.println("2. Marca");
                                    System.out.println("3. Modelo");
                                    System.out.println("4. Tipo");
                                    System.out.println("5. Color");
                                    System.out.println("6. Año");
                                    System.out.println("7. Velocidad Max");
                                    System.out.println("8. Peso");
                                    System.out.println("9. Consumo Combustible");
                                    int opcion1 = read.nextInt();

                                    switch (opcion1) {
                                        case 1: {
                                            System.out.println("Ingrese la nueva placa");
                                            String placa = read.next();
                                            ((Motocicleta) Vehiculo.get(index - 1)).setPlaca(placa);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Ingrese la nueva marca");
                                            String marca = read.next();
                                            ((Motocicleta) Vehiculo.get(index - 1)).setMarca(marca);
                                            break;
                                        }

                                        case 3: {
                                            System.out.println("Ingrese el nuevo modelo");
                                            String modelo = read.next();
                                            ((Motocicleta) Vehiculo.get(index - 1)).setModelo(modelo);
                                            break;
                                        }

                                        case 4: {
                                            System.out.println("Ingrese el nuevo tipo");
                                            String tipo = read.next();
                                            ((Motocicleta) Vehiculo.get(index - 1)).setTipo(tipo);
                                            break;
                                        }

                                        case 5: {
                                            System.out.println("Ingrese el nuevo color");
                                            Color color = color = JColorChooser.showDialog(null, "Seleccione un color", Color.WHITE);
                                            ((Motocicleta) Vehiculo.get(index - 1)).setColor(color);
                                            break;
                                        }

                                        case 6: {
                                            DateFormat df = new SimpleDateFormat("yyyy");
                                            System.out.println("Ingrese el nuevo año");
                                            String añostr = read.next();
                                            Date año = df.parse(añostr);
                                            ((Motocicleta) Vehiculo.get(index - 1)).setAño(año);
                                            break;
                                        }

                                        case 7: {
                                            System.out.println("Ingrese la nueva velocidad maxima");
                                            double velocidad = leer.nextDouble();
                                            ((Motocicleta) Vehiculo.get(index - 1)).setVelMax(velocidad);
                                            break;
                                        }

                                        case 8: {
                                            System.out.println("Ingrese el nuevo peso");
                                            double peso = leer.nextDouble();
                                            ((Motocicleta) Vehiculo.get(index - 1)).setPeso(peso);
                                            break;
                                        }

                                        case 9: {
                                            System.out.println("Ingrese el nuevo consumo de combustible");
                                            double combustible = leer.nextDouble();
                                            ((Motocicleta) Vehiculo.get(index - 1)).setConsumo(combustible);
                                            break;
                                        }

                                        default: {
                                            System.out.println("Ingrese una opción valida por favor");
                                            break;
                                        }
                                    }
                                } else if (vehic instanceof Autobus) {
                                    System.out.println("Escoja que desea cambiar del Autobu");
                                    System.out.println("1. Placa");
                                    System.out.println("2. Marca");
                                    System.out.println("3. Modelo");
                                    System.out.println("4. Tipo");
                                    System.out.println("5. Color");
                                    System.out.println("6. Año");
                                    System.out.println("7. Capacidad");
                                    System.out.println("8. Numero de Ejes");
                                    System.out.println("9. Longitud");
                                    int opcion1 = read.nextInt();

                                    switch (opcion1) {
                                        case 1: {
                                            System.out.println("Ingrese la nueva placa");
                                            String placa = read.next();
                                            ((Autobus) Vehiculo.get(index - 1)).setPlaca(placa);
                                            break;
                                        }

                                        case 2: {
                                            System.out.println("Ingrese la nueva marca");
                                            String marca = read.next();
                                            ((Autobus) Vehiculo.get(index - 1)).setMarca(marca);
                                            break;
                                        }

                                        case 3: {
                                            System.out.println("Ingrese el nuevo modelo");
                                            String modelo = read.next();
                                            ((Autobus) Vehiculo.get(index - 1)).setModelo(modelo);
                                            break;
                                        }

                                        case 4: {
                                            System.out.println("Ingrese el nuevo tipo");
                                            String tipo = read.next();
                                            ((Autobus) Vehiculo.get(index - 1)).setTipo(tipo);
                                            break;
                                        }

                                        case 5: {
                                            System.out.println("Ingrese el nuevo color");
                                            Color color = color = JColorChooser.showDialog(null, "Seleccione un color", Color.WHITE);
                                            ((Autobus) Vehiculo.get(index - 1)).setColor(color);
                                            break;
                                        }

                                        case 6: {
                                            DateFormat df = new SimpleDateFormat("yyyy");
                                            System.out.println("Ingrese el nuevo año");
                                            String añostr = read.next();
                                            Date año = df.parse(añostr);
                                            ((Autobus) Vehiculo.get(index - 1)).setAño(año);
                                            break;
                                        }

                                        case 7: {
                                            System.out.println("Ingrese la nueva capacidad");
                                            int capacidad = leer.nextInt();
                                            ((Autobus) Vehiculo.get(index - 1)).setCapacidad(capacidad);
                                            break;
                                        }

                                        case 8: {
                                            System.out.println("Ingrese el nuevo numero de ejes");
                                            int ejes = leer.nextInt();
                                            ((Autobus) Vehiculo.get(index - 1)).setNumEjes(ejes);
                                            break;
                                        }

                                        case 9: {
                                            System.out.println("Ingrese la nueva longitud");
                                            double longitud = leer.nextDouble();
                                            ((Autobus) Vehiculo.get(index - 1)).setLongitud(longitud);
                                            break;
                                        }

                                        default: {
                                            System.out.println("Ingrese una opción valida por favor");
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Tipo no valido");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Indice invalido");
                            break;
                        }

                    }
                    break;
                }

                case "5": {
                    if (Vehiculo.isEmpty()) {
                        System.out.println("Debe agregar CUALQUIER vehiculo para eliminarlos");
                        break;
                    } else {
                        System.out.println("Ingrese el vehiculo a eliminar");
                        System.out.println("Así se ve la lista de Vehiculos actualmente");
                        int i = 1;

                        for (Vehiculo vehiculo : Vehiculo) {
                            System.out.println(i + ". " + infoVehiculo(vehiculo));
                            i++;
                        }
                        System.out.println("Escoja el vehiculo que desea modificar");
                        int index = leer.nextInt();
                        if (index >= 1 && index <= Vehiculo.size()) {
                            int f = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar?");
                            if (f == 0) {
                                Vehiculo.remove(index - 1);
                                JOptionPane.showMessageDialog(null, "TV eliminado exitosamente");
                            } else {
                                JOptionPane.showMessageDialog(null, "No se eliminó el televisor");
                            }

                        } else {
                            System.out.println("Vehiculo no encontrado");
                            break;
                        }
                    }
                    break;
                }

                case "6": {
                    if (Vehiculo.isEmpty()) {
                        System.out.println("Debe agregar CUALQUIER vehiculo para listarlos");
                        break;
                    } else {
                        int i = 1;
                        System.out.println("Así se ve la lista de los vehiculos actualmente");
                        for (Vehiculo vehiculo : Vehiculo) {
                            System.out.println(i + ". " + infoVehiculo(vehiculo));
                            i++;
                        }
                    }
                    break;
                }

                case "7": {
                    if (Vehiculo.isEmpty()) {
                        System.out.println("Debe agregar CUALQUIER vehiculo para generar una boleta");
                        break;
                    } else {
                        int i = 1;
                        int Base = 525;
                        System.out.println("Así se ve la lista de los vehiculos actualmente");
                        for (Vehiculo vehiculo : Vehiculo) {
                            System.out.println(i + ". " + infoVehiculo(vehiculo));
                            i++;
                        }
                        System.out.println("Escoja el vehiculo para conocer su Tasa Vehicular");
                        int index = leer.nextInt();
                        Vehiculo vehic = Vehiculo.get(index - 1);
                        if (index >= 1 && index <= Vehiculo.size()) {
                            if (vehic instanceof Automovil) {
                                Base += 1200;                                
                                System.out.println("Atributos de el vehiculo seleccionado");
                                System.out.println(vehic.toString());
                                System.out.println("Su tasa vehicular es " + Base);
                            } else if (vehic instanceof Motocicleta) {
                                Base += 200;
                                System.out.println("Atributos de el vehiculo seleccionado");
                                System.out.println(vehic.toString());
                                System.out.println("Su tasa vehicular es " + Base);
                            } else if (vehic instanceof Autobus) {
                                Base += 1000;
                                System.out.println("Atributos de el vehiculo seleccionado");
                                System.out.println(vehic.toString());
                                System.out.println("Su tasa vehicular es " + Base);
                            } else {
                                System.out.println("Indice invalido");
                                break;
                            }
                        } else {
                            System.out.println("Indice invalido");
                            break;
                        }
                    }
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

    public static String infoVehiculo(Vehiculo vehiculo) {

        if (vehiculo instanceof Automovil) {
            return vehiculo.toString();
        } else if (vehiculo instanceof Motocicleta) {
            return vehiculo.toString();
        } else if (vehiculo instanceof Autobus) {
            return vehiculo.toString();
        }
        return "Invalido";

    }

    public static boolean validarPlaca(String placa) {
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(placa.charAt(i))) {
                return false;
            }
        }

        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(placa.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean existePlaca(String placa) {
        for (Vehiculo vehiculo : Vehiculo) {
            if (vehiculo.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }
}
