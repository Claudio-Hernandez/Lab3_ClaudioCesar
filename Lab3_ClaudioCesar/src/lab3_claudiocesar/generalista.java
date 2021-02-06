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
public class generalista extends Marca {

    private String tipo;

    public generalista() {
        super();
    }

    public generalista(String tipo, String nombre, String lema, int añoDeFundacion, int añoDeIntegracion, String fundador, double ventasAnuales, String presidente, ArrayList<modelos> numeroDeModelos,int cantidadDeModelos) {
        super(nombre, lema, añoDeFundacion, añoDeIntegracion, fundador, ventasAnuales, presidente, numeroDeModelos,cantidadDeModelos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == "low-cost " || tipo == "semi-premium") {
            this.tipo = tipo;

        }
    }

    @Override
    public String toString() {
        return "Marca de tipo generalista" + super.toString() + "tipo=" + tipo;
    }

}
