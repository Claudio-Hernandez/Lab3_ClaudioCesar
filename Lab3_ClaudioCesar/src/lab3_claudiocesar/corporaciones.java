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
public class corporaciones {

    //Nombre,sede, 
    //año de fundación, CEO o presidente, númerototal 
    //de empleados,cantidad de autos que se pueden fabricadosy cuenta con una
    //lista de marcas que pertenecen a la corporación. 
    private String nombre;
    private String sede;
    private int añoDeFundacion;
    private String ceo;
    private int cantEmpleados;
    private int cantAutos;
    private ArrayList<Marca> marcas = new ArrayList<Marca>();
    private ArrayList<fabricas> fabricas =   new ArrayList();
    private ArrayList<divisionTecnologica>  Divisionestecnologicas =  new ArrayList();

    public corporaciones() {
    }

    public corporaciones(String nombre, String sede, int añoDeFundacion, String ceo, int cantEmpleados, int cantAutos,ArrayList<Marca> marcas,ArrayList<fabricas> fabricas,ArrayList<divisionTecnologica>  Divisionestecnologicas) {
        this.nombre = nombre;
        this.sede = sede;
        this.añoDeFundacion = añoDeFundacion;
        this.ceo = ceo;
        this.cantEmpleados = cantEmpleados;
        this.cantAutos = cantAutos;
        marcas =  marcas;
        this.fabricas =  fabricas;
        this.Divisionestecnologicas =  Divisionestecnologicas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getAño() {
        return añoDeFundacion;
    }

    public void setAño(int año) {
        this.añoDeFundacion = año;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    public int getCantAutos() {
        return cantAutos;
    }

    public void setCantAutos(int cantAutos) {
        this.cantAutos = cantAutos;
    }

    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<Marca> marcas) {
        this.marcas = marcas;
    }

    public ArrayList<fabricas> getFabricas() {
        return fabricas;
    }

    public void setFabricas(ArrayList<fabricas> fabricas) {
        this.fabricas = fabricas;
    }

    public ArrayList<divisionTecnologica> getDivisionestecnologicas() {
        return Divisionestecnologicas;
    }

    public void setDivisionestecnologicas(ArrayList<divisionTecnologica> Divisionestecnologicas) {
        this.Divisionestecnologicas = Divisionestecnologicas;
    }
    
    

    @Override
    public String toString() {
        return "Corporacion" + "\nnombre=" + nombre + "\n sede=" + sede + "\n año de fundacion=" + añoDeFundacion + " nombre de  ceo=" + ceo + " cantidad de empleados=" + cantEmpleados + "\n cantidad de Autos=" + cantAutos + "\n Marcas=" + marcas +"\nFabricas"+ fabricas + "\nDivisiones tecnologicas" +Divisionestecnologicas;
    }
    
}
