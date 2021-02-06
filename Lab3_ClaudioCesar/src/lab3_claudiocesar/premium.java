/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_claudiocesar;

import java.util.ArrayList;

/**
 *
 * @author Claudio Hernandez
 */
public class premium extends Marca {
   private String nombreDivisionDeportiva; 
   private String nombreDivisionLujo;
   private modelos CarroceriaMasFabricada;

    public premium() {
        super();
    }

    public premium(String nombreDivisionDeportiva, String nombreDivisionLujo, modelos CarroceriaMasFabricada, String nombre, String lema, int añoDeFundacion, int añoDeIntegracion, String fundador, double ventasAnuales, String presdente, ArrayList<modelos> numeroDeModelos, int cantidademodelos) {
        super(nombre, lema, añoDeFundacion, añoDeIntegracion, fundador, ventasAnuales, presdente, numeroDeModelos, cantidademodelos);
        this.nombreDivisionDeportiva = nombreDivisionDeportiva;
        this.nombreDivisionLujo = nombreDivisionLujo;
        this.CarroceriaMasFabricada = CarroceriaMasFabricada;
    }

    

    public String getNombreDivisionDeportiva() {
        return nombreDivisionDeportiva;
    }

    public void setNombreDivisionDeportiva(String nombreDivisionDeportiva) {
        this.nombreDivisionDeportiva = nombreDivisionDeportiva;
    }

    public String getNombreDivisionLujo() {
        return nombreDivisionLujo;
    }

    public void setNombreDivisionLujo(String nombreDivisionLujo) {
        this.nombreDivisionLujo = nombreDivisionLujo;
    }

    public modelos getCarroceriaMasFabricada() {
        return CarroceriaMasFabricada;
    }

    public void setCarroceriaMasFabricada(modelos CarroceriaMasFabricada) {
        this.CarroceriaMasFabricada = CarroceriaMasFabricada;
    }

    @Override
    public String toString() {
        return " Marca de tipo premium" + super.toString()+"-- nombre Division Deportiva=" + nombreDivisionDeportiva + "-- nombre Division de Lujo=" + nombreDivisionLujo + "-- Carroceria Mas Fabricada=" + CarroceriaMasFabricada;
    }
    
   
   
}
