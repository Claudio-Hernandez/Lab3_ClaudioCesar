/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_claudiocesar;

/**
 *
 * @author Claudio Hernandez
 */
public class hatchback  extends modelos{
    private int capacidadMaletero;
    private double longitud;
    private int bolsasDeAire;

    public hatchback() {
        super();
    }

    public hatchback(int capacidadMaletero, double longitud, int bolsasDeAire, String nombre, int añoDeFabricacion, String motor, double Cilindradamotor, double precio, String tecnologia) {
        super(nombre, añoDeFabricacion, motor, Cilindradamotor, precio, tecnologia);
        this.capacidadMaletero = capacidadMaletero;
        this.longitud = longitud;
        this.bolsasDeAire = bolsasDeAire;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getBolsasDeAire() {
        return bolsasDeAire;
    }

    public void setBolsasDeAire(int bolsasDeAire) {
        this.bolsasDeAire = bolsasDeAire;
    }

    @Override
    public String toString() {
        return " modelo hatchback" +super.toString()+ "--capacidad de Maletero=" + capacidadMaletero + "--longitud=" + longitud + "--bolsasDeAire=" + bolsasDeAire ;
    }
    
    
}
