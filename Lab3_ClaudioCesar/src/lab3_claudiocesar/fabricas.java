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
public class fabricas {
    private String nombre;
    private String ubicacion;
    private int cantidadMaximaDeModelos;
     private String CarroceriaMasFabricada ;
     private int cantidadDeEmpleados;
     private String nombresDeMarca; 
     private int cantidadDeAutosActualmente;

    public fabricas() {
    }

    public fabricas(String nombre, String ubicacion, int cantidadMaximaDeModelos, String CarroceriaMasFabricada, int cantidadDeEmpleados, String nombresDeMarca, int cantidadDeAutosActualmente) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidadMaximaDeModelos = cantidadMaximaDeModelos;
        this.CarroceriaMasFabricada = CarroceriaMasFabricada;
        this.cantidadDeEmpleados = cantidadDeEmpleados;
        this.nombresDeMarca = nombresDeMarca;
        this.cantidadDeAutosActualmente = cantidadDeAutosActualmente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadMaximaDeModelos() {
        return cantidadMaximaDeModelos;
    }

    public void setCantidadMaximaDeModelos(int cantidadMaximaDeModelos) {
        this.cantidadMaximaDeModelos = cantidadMaximaDeModelos;
    }

    public String getCarroceriaMasFabricada() {
        return CarroceriaMasFabricada;
    }

    public void setCarroceriaMasFabricada(String CarroceriaMasFabricada) {
        this.CarroceriaMasFabricada = CarroceriaMasFabricada;
    }

    public int getCantidadDeEmpleados() {
        return cantidadDeEmpleados;
    }

    public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
        this.cantidadDeEmpleados = cantidadDeEmpleados;
    }

    public String getNombresDeMarca() {
        return nombresDeMarca;
    }

    public void setNombresDeMarca(String nombresDeMarca) {
        this.nombresDeMarca = nombresDeMarca;
    }

    public int getCantidadDeAutosActualmente() {
        return cantidadDeAutosActualmente;
    }

    public void setCantidadDeAutosActualmente(int cantidadDeAutosActualmente) {
        this.cantidadDeAutosActualmente = cantidadDeAutosActualmente;
    }

    @Override
    public String toString() {
        return "fabrica:" + "nombre=" + nombre + "-- ubicacion=" + ubicacion + "--cantidad Maxima De Modelos fabricados=" + cantidadMaximaDeModelos + "\nCarroceria Mas Fabricada=" + CarroceriaMasFabricada + "\ncantidad De Empleados=" + cantidadDeEmpleados + "-- nombre De Marca=" + nombresDeMarca + "--cantidad De Autos fabricados Actualmente=" + cantidadDeAutosActualmente;
    }
     
     
}
