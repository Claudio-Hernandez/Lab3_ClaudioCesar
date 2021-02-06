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
public class divisionTecnologica {
    private String nombre;
    private int añoDeCreacion;
    private String campoDedicaion;
    private ArrayList<String>techYaDesarrollada = new ArrayList();

    public divisionTecnologica() {
    }

    public divisionTecnologica(String nombre, int añoDeCreacion, String campoDedicaion,ArrayList<String>techYaDesarrollada) {
        this.nombre = nombre;
        this.añoDeCreacion = añoDeCreacion;
        this.campoDedicaion = campoDedicaion;
        this.techYaDesarrollada=techYaDesarrollada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoDeCreacion() {
        return añoDeCreacion;
    }

    public void setAñoDeCreacion(int añoDeCreacion) {
        this.añoDeCreacion = añoDeCreacion;
    }

    public String getCampoDedicaion() {
        return campoDedicaion;
    }

    public void setCampoDedicaion(String campoDedicaion) {
        this.campoDedicaion = campoDedicaion;
    }

    public ArrayList<String> getTechYaDesarrollada() {
        return techYaDesarrollada;
    }

    public void setTechYaDesarrollada(ArrayList<String> techYaDesarrollada) {
        this.techYaDesarrollada = techYaDesarrollada;
    }

    @Override
    public String toString() {
        return "\nDivision Tecnologica" + "nombre=" + nombre + ", anio De Creacion=" + añoDeCreacion + ", campo de dedicacion=" + campoDedicaion + ", tecnologia ya desarrollada=" + techYaDesarrollada;
    }
    
    
}
