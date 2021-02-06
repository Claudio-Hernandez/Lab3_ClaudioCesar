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
public class modelos {
    //nombre del modelo, año de fabricación, tipo de motor, cilindrada del motor, precio y tecnologías.
    private String nombre;
    private int añoDeFabricacion;
    private String motor;
    private double Cilindradamotor;
    private double precio;
    private String tecnologia;

    public modelos() {
    }

    public modelos(String nombre, int añoDeFabricacion, String motor, double Cilindradamotor, double precio, String tecnologia) {
        this.nombre = nombre;
        this.añoDeFabricacion = añoDeFabricacion;
        this.motor = motor;
        this.Cilindradamotor = Cilindradamotor;
        this.precio = precio;
        this.tecnologia = tecnologia;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getCilindradamotor() {
        return Cilindradamotor;
    }

    public void setCilindradamotor(double Cilindradamotor) {
        this.Cilindradamotor = Cilindradamotor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Modelo" + "nombre=" + nombre + "- año De Fabricacion=" + añoDeFabricacion + "- motor=" + motor + "- Cilindrada  de motor=" + Cilindradamotor + "- precio=" + precio + "- tecnologia=" + tecnologia ;
    }
    private void incremento(Marca tipo){
        if (tipo instanceof premium) {
            precio =  precio+((precio*20)/100);
        }else if (tipo instanceof generalista){
                        precio =  precio+((precio*15)/100);

        
        }
    
    }
    
    
}
