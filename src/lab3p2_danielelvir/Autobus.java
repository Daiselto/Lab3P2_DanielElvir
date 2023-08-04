
package lab3p2_danielelvir;

import java.awt.Color;
import java.util.Date;


public class Autobus extends Vehiculo{
    int Capacidad, NumEjes;
    double longitud;

    public Autobus() {
        super();
    }

    public Autobus(int Capacidad, int NumEjes, double longitud, String Placa, String Marca, String Modelo, String Tipo, Color color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, color, Año);
        this.Capacidad = Capacidad;
        this.NumEjes = NumEjes;
        this.longitud = longitud;
    }

    
    
    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getNumEjes() {
        return NumEjes;
    }

    public void setNumEjes(int NumEjes) {
        this.NumEjes = NumEjes;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {        
        return super.toString()+"Capacidad=" + Capacidad +"\n"+ "NumEjes=" + NumEjes +"\n"+ "longitud=" +"\n"+ longitud ;
    }
    
    
    
    
}
