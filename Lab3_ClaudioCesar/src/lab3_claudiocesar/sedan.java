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
public class sedan  extends modelos{

   // AndroidPlay (Si o no), AndroidAuto(Si o no) y una lista de Asistentes de Conducción.
    private boolean androidPlay =false;
    private boolean androidAuto =  false;
    private ArrayList<String> asistentesConduccion =  new ArrayList();

    public sedan() {
    }

    public sedan(boolean androidPlay, boolean androidAuto, String nombre, int añoDeFabricacion, String motor, double Cilindradamotor, double precio, String tecnologia,ArrayList<String> asistentesDeConduccion) {
        super(nombre, añoDeFabricacion, motor, Cilindradamotor, precio, tecnologia);
        this.androidPlay = androidPlay;
        this.androidAuto = androidAuto;
    }

    public boolean getAndroidPlay() {
        return androidPlay;
    }

    public void setAndroidPlay(String androidPlay) {
        if (androidPlay=="si"||androidPlay=="SI") {
                    this.androidPlay = true;

        }
        
    }

    public boolean getAndroidAuto() {
        return androidAuto;
    }

    public void setAndroidAuto(String androidAuto) {
        if (androidAuto=="si"||androidAuto=="SI") {
                            this.androidAuto = true;


        }
    }

    public ArrayList<String> getAsistentesConduccion() {
        return asistentesConduccion;
    }

    public void setAsistentesConduccion(ArrayList<String> asistentesConduccion) {
        this.asistentesConduccion = asistentesConduccion;
    }

    @Override
    public String toString() {
        return " modelo sedan" + super.toString()+"--androidPlay=" + androidPlay + "-- androidAuto=" + androidAuto + "-- asistentesConduccion=" + asistentesConduccion;
    }
    
    
}
