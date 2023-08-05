
package lab3p2_danielelvir;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JColorChooser;
public class Vehiculo {
    private String Placa, Marca, Modelo, Tipo;
    private Color color;
    private Date Año;
    private DateFormat df = new SimpleDateFormat("yyyy");

    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Marca, String Modelo, String Tipo, Color color, Date Año) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.color = color;
        this.Año = Año;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAño() {
        return Año;
    }

    public void setAño(Date Año) {
        this.Año = Año;
    }

    @Override
    public String toString() {
        return "\n" + "Placa=" + Placa +"\n" + "Marca=" + Marca +"\n" + "Modelo=" + Modelo +"\n" + "Tipo=" + Tipo +"\n" + "color=" + color +"\n" + "Año=" + df.format(Año) +"\n" ;
    }
    
    
    
}
