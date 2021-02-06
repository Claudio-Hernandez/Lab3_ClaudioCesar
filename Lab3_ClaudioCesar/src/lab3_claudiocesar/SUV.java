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
public class SUV extends modelos {
    private boolean cuatrox4=false;
    private int cantidadPasajeros;
    private String navegador;

    public SUV() {
        super();
    }

    public SUV(String  cuatrox4, int cantidadPasajeros, String nombre, int añoDeFabricacion, String motor, double Cilindradamotor, double precio, String tecnologia) {
        super(nombre, añoDeFabricacion, motor, Cilindradamotor, precio, tecnologia);
        setCuatrox4(cuatrox4);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isCuatrox4() {
        return cuatrox4;
    }

    public void setCuatrox4(String cuatrox4) {
         if (cuatrox4 =="si"||cuatrox4=="SI") {
                    this.cuatrox4 = true;

        }
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    @Override
    public String toString() {
        return "Modelo SUV" + super.toString()+"4x4=" + cuatrox4 + "-- cantidad de Pasajeros=" + cantidadPasajeros + "-- navegador=" + navegador ;
    }
    
    
   
}
