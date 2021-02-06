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
public class Marca {
    /*
    Lasmarcasde automóviles se componende nombre,
    slogan o lema, año de fundación, año que se integro a la corporación, fundador,
    total de ventas anuales, CEO o presidentey número de modelos. Las marcas pueden ser:
    */
    private String nombre;
    private String lema;
    private int añoDeFundacion;
    private int añoDeIntegracion;
    private String fundador;
    private double ventasAnuales;
    private String presidente;
    private int cantModelos;
    private ArrayList<modelos> numeroDeModelos  =  new ArrayList();

    public Marca() {
    }

    public Marca(String nombre, String lema, int añoDeFundacion, int añoDeIntegracion, String fundador, double ventasAnuales, String presdente, ArrayList<modelos> numeroDeModelos,int cantidademodelos) {
        this.nombre = nombre;
        this.lema = lema;
        this.añoDeFundacion = añoDeFundacion;
        this.añoDeIntegracion = añoDeIntegracion;
        this.fundador = fundador;
        this.ventasAnuales = ventasAnuales;
        this.presidente = presdente;
        this.numeroDeModelos = numeroDeModelos;
        this.cantModelos =  cantidademodelos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getAñoDeFundacion() {
        return añoDeFundacion;
    }

    public void setAñoDeFundacion(int añoDeFundacion) {
        this.añoDeFundacion = añoDeFundacion;
    }

    public int getAñoDeIntegracion() {
        return añoDeIntegracion;
    }

    public void setAñoDeIntegracion(int añoDeIntegracion) {
        this.añoDeIntegracion = añoDeIntegracion;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public double getVentasAnuales() {
        return ventasAnuales;
    }

    public void setVentasAnuales(double ventasAnuales) {
        this.ventasAnuales = ventasAnuales;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presdente) {
        this.presidente = presdente;
    }

    public ArrayList<modelos> getNumeroDeModelos() {
        return numeroDeModelos;
    }

    public void setNumeroDeModelos(ArrayList<modelos> numeroDeModelos) {
        this.numeroDeModelos = numeroDeModelos;
    }

    public int getCantModelos() {
        return cantModelos;
    }

    public void setCantModelos(int cantModelos) {
        this.cantModelos = cantModelos;
    }
    

    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + ", lema=" + lema + ", a\u00f1oDeFundacion=" + añoDeFundacion + ", a\u00f1oDeIntegracion=" + añoDeIntegracion + ", fundador=" + fundador + ", ventasAnuales=" + ventasAnuales + ", presdente=" + presidente + ", numero De Modelos=" + cantModelos +"Modelos:"+ numeroDeModelos;
    }
    
    
}
