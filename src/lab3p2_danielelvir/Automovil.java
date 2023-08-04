
package lab3p2_danielelvir;

import java.awt.Color;
import java.util.Date;


public class Automovil extends Vehiculo {
    private String TipoCombustible, TipoTransmision;
    int numPuertas, numAsiento;

    public Automovil() {
        super();
    }

    public Automovil(String TipoCombustible, String TipoTransmision, int numPuertas, int numAsiento, String Placa, String Marca, String Modelo, String Tipo, Color color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, color, Año);
        this.TipoCombustible = TipoCombustible;
        this.TipoTransmision = TipoTransmision;
        this.numPuertas = numPuertas;
        this.numAsiento = numAsiento;
    }
    
    

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

    public String getTipoTransmision() {
        return TipoTransmision;
    }

    public void setTipoTransmision(String TipoTransmision) {
        this.TipoTransmision = TipoTransmision;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
    
    
}
