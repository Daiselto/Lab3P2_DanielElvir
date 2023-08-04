
package lab3p2_danielelvir;

import java.awt.Color;
import java.util.Date;


public class Motocicleta extends Vehiculo{
    double VelMax, Peso, Consumo;

    public Motocicleta() {
        super();    
    }

    public Motocicleta(double VelMax, double Peso, double Consumo, String Placa, String Marca, String Modelo, String Tipo, Color color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, color, Año);
        this.VelMax = VelMax;
        this.Peso = Peso;
        this.Consumo = Consumo;
    }

    @Override
    public String toString() {       
        return super.toString()+"VelMax=" + VelMax +"\n" + "Peso=" + Peso +"\n" + "Consumo=" + Consumo + "\n" ;
    }
    
    
    
}
