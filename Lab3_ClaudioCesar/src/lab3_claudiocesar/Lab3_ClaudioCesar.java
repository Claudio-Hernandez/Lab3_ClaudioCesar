/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_claudiocesar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Claudio Hernandez
 */
public class Lab3_ClaudioCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        int cont = 0;
        int op = 1;
        ArrayList<corporaciones> Corporaciones = new ArrayList();
        ArrayList<modelos> models = new ArrayList();
        ArrayList<fabricas> fabricas = new ArrayList();
        while (opcion != 8) {
            System.out.println("1- Corporaciones\n"
                    + "2- Marcas\n"
                    + "3- Fabricas\n"
                    + "4- Modelos\n"
                    + "5- Divisiones Tecnologicas\n"
                    + "6- Informe Total\n"
                    + "7.Modificar"
                    + "8- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1. Agregar\n"
                            + "2. Eliminar\n"
                    );
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese el nombre de la corporacion: ");
                            String nombre = sc.next();
                            System.out.println("Ingrese la sede de la corporacion");
                            String sede = sc.next();
                            System.out.println("Ingrese el año de fundación");
                            int fundacion = sc.nextInt();
                            System.out.println("Ingrese el nombre del CEO o Presidente: ");
                            String CEO = sc.next();
                            System.out.println("Ingrese el numero total de empleados");
                            int empleados = sc.nextInt();
                            System.out.println("Ingrese la cantidad de autos que se puedenfabricar");
                            int autosFabricados = sc.nextInt();
                            Corporaciones.add(new corporaciones());
                            Corporaciones.get(cont).setNombre(nombre);
                            Corporaciones.get(cont).setSede(sede);
                            Corporaciones.get(cont).setAño(fundacion);
                            Corporaciones.get(cont).setCeo(CEO);
                            Corporaciones.get(cont).setCantEmpleados(empleados);
                            Corporaciones.get(cont).setCantAutos(autosFabricados);
                            cont++;
                            break;
                        case 2:
                            System.out.println("Ingrese la posicion de lac corporacion que desea eliminar");
                            int p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                Corporaciones.remove(p);
                            } else {
                                System.out.println("La posicion que ingreso no tiene Corporacion");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la posicion de lac corporacion que desea cambiar");
                            p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                System.out.println("Ingrese el nombre de la corporacion: ");
                                nombre = sc.next();
                                System.out.println("Ingrese la sede de la corporacion");
                                sede = sc.next();
                                System.out.println("Ingrese el año de fundación");
                                fundacion = sc.nextInt();
                                System.out.println("Ingrese el nombre del CEO o Presidente: ");
                                CEO = sc.next();
                                System.out.println("Ingrese el numero total de empleados");
                                empleados = sc.nextInt();
                                System.out.println("Ingrese la cantidad de autos que se puedenfabricar");
                                autosFabricados = sc.nextInt();
                                Corporaciones.get(p).setNombre(nombre);
                                Corporaciones.get(p).setSede(sede);
                                Corporaciones.get(p).setAño(fundacion);
                                Corporaciones.get(p).setCeo(CEO);
                                Corporaciones.get(p).setCantEmpleados(empleados);
                                Corporaciones.get(p).setCantAutos(autosFabricados);
                            } else {
                                System.out.println("La posicion que ingreso no esta disponible");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Agregar\n"
                            + "2. Listar\n"
                    );
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese la posicion de lac corporacion que desea agregar una marca");
                            int p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                ArrayList<modelos> numeroDeModelos = new ArrayList();
                                System.out.println("Ingrese el nombre de la marca");
                                String nombreMarca = sc.next();
                                System.out.println("Ingrese el lems");
                                String lema = sc.next();
                                System.out.println("Ingrese el año de fundación");
                                int anoDeFundacion = sc.nextInt();
                                System.out.println("Ingrese el año de Integracion");
                                int anoDeIntegracion = sc.nextInt();
                                System.out.println("Ingrese el nombre del fundador");
                                String fundador = sc.next();
                                System.out.println("Ingrese el numero de ventas anuales");
                                double ventasAnuales = sc.nextDouble();
                                System.out.println("Ingrese el nombre del presidente");
                                String presidente = sc.next();
                                System.out.println("Ingrese la cantidad de modelos");
                                int cantModelos = sc.nextInt();

                                System.out.println("Ingrese el nombre del modeli");
                                String nombre = sc.next();
                                System.out.println("Ingrese el año de fabricacion");
                                int anoDeFabricacion = sc.nextInt();
                                System.out.println("Ingrese el motor");
                                String motor = sc.next();
                                System.out.println("Ingrese el Cilindra da motor");
                                double Cilindradamotor = sc.nextDouble();
                                System.out.println("Ingrese el precio");
                                double precio = sc.nextDouble();
                                System.out.println("Ingrese la tecnologia");
                                String tecnologia = sc.next();
                                numeroDeModelos.add(new modelos(nombre, anoDeFabricacion, motor, Cilindradamotor, precio, tecnologia));

                                Corporaciones.get(p).getMarcas().add(new Marca(nombreMarca, lema, anoDeFundacion, anoDeIntegracion, fundador, ventasAnuales, presidente, numeroDeModelos, cantModelos));
                            } else {
                                System.out.println("La posicion que ingreso no tiene Corporacion");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la posicion de la corporacion que desea ver sus fabricas");
                            p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                System.out.println(Corporaciones.get(p).getMarcas());
                            } else {
                                System.out.println("La posicion que ingreso no esta disponible");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la posicion de la corporacion que desea modificar las marcas");
                            p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                System.out.println("Ingrese la posicion de la marca que desea cambiar");
                                int po = sc.nextInt();
                                if (p <= Corporaciones.get(p).getMarcas().size()) {
                                    ArrayList<modelos> numeroDeModelos = new ArrayList();
                                    System.out.println("Ingrese el nombre de la marca");
                                    String nombreMarca = sc.next();
                                    System.out.println("Ingrese el lems");
                                    String lema = sc.next();
                                    System.out.println("Ingrese el año de fundación");
                                    int anoDeFundacion = sc.nextInt();
                                    System.out.println("Ingrese el año de Integracion");
                                    int anoDeIntegracion = sc.nextInt();
                                    System.out.println("Ingrese el nombre del fundador");
                                    String fundador = sc.next();
                                    System.out.println("Ingrese el numero de ventas anuales");
                                    double ventasAnuales = sc.nextDouble();
                                    System.out.println("Ingrese el nombre del presidente");
                                    String presidente = sc.next();
                                    System.out.println("Ingrese la cantidad de modelos");
                                    int cantModelos = sc.nextInt();
                                    Corporaciones.get(p).getMarcas().get(po).setAñoDeFundacion(anoDeFundacion);
                                    Corporaciones.get(p).getMarcas().get(po).setAñoDeIntegracion(anoDeIntegracion);
                                    Corporaciones.get(p).getMarcas().get(po).setNumeroDeModelos(numeroDeModelos);
                                    Corporaciones.get(p).getMarcas().get(po).setNombre(nombreMarca);
                                    Corporaciones.get(p).getMarcas().get(po).setLema(lema);
                                    Corporaciones.get(p).getMarcas().get(po).setFundador(fundador);
                                    Corporaciones.get(p).getMarcas().get(po).setVentasAnuales(ventasAnuales);
                                    Corporaciones.get(p).getMarcas().get(po).setPresidente(presidente);
                                    Corporaciones.get(p).getMarcas().get(po).setCantModelos(cantModelos);
                                } else {
                                    System.out.println("La posicion que ingreso no esta disponible");
                                }
                            } else {
                                System.out.println("La posicion que ingreso no esta disponible");
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Agregar\n"
                            + "2. Listar\n"
                    );
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese la posicion de la corporacion que desea agregar una fabrica");
                            int p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                ArrayList<modelos> numeroDeModelos = new ArrayList();
                                //ArrayList<fabricas> fabricas =   new ArrayList();
                                System.out.println("Ingrese el nombre de la fabrica");
                                String nombre = sc.next();
                                System.out.println("Ingrese la ubicacion de la fabrica");
                                String ubicacion = sc.next();
                                System.out.println("Ingrese el cantidad Maxima De Modelos");
                                int cantidadMaximaDeModelos = sc.nextInt();
                                System.out.println("Ingrese el cantidad de empleados");
                                int cantidadDeEmpleados = sc.nextInt();
                                System.out.println("Ingrese el cantidad cantidad De Autos Actualmente");
                                int cantidadDeAutosActualmente = sc.nextInt();
                                //===========================================
                                System.out.println("Ingrese el nombre de la marca");
                                String nombreMarca = sc.next();
                                System.out.println("Ingrese el lems");
                                String lema = sc.next();
                                System.out.println("Ingrese el año de fundación");
                                int anoDeFundacion = sc.nextInt();
                                System.out.println("Ingrese el año de Integracion");
                                int anoDeIntegracion = sc.nextInt();
                                System.out.println("Ingrese el nombre del fundador");
                                String fundador = sc.next();
                                System.out.println("Ingrese el numero de ventas anuales");
                                double ventasAnuales = sc.nextDouble();
                                System.out.println("Ingrese el nombre del presidente");
                                String presidente = sc.next();
                                System.out.println("Ingrese la cantidad de modelos");
                                int cantModelos = sc.nextInt();
                                //===========================================
                                System.out.println("Ingrese el nombre del modeli");
                                String nombre2 = sc.next();
                                System.out.println("Ingrese el año de fabricacion");
                                int anoDeFabricacion = sc.nextInt();
                                System.out.println("Ingrese el motor");
                                String motor = sc.next();
                                System.out.println("Ingrese el Cilindra da motor");
                                double Cilindradamotor = sc.nextDouble();
                                System.out.println("Ingrese el precio");
                                double precio = sc.nextDouble();
                                System.out.println("Ingrese la tecnologia");
                                String tecnologia = sc.next();
                                numeroDeModelos.add(new modelos(nombre, anoDeFabricacion, motor, Cilindradamotor, precio, tecnologia));
                                Corporaciones.get(p).getFabricas().add(new fabricas(nombre, ubicacion, cantidadMaximaDeModelos, "SUV", cantidadDeEmpleados, "carros", cantidadDeAutosActualmente));
                            } else {
                                System.out.println("La posicion que ingreso no tiene Corporacion");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la posicion de la corporacion que desea ver sus fabricas");
                            p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                System.out.println(Corporaciones.get(p).getFabricas());
                            } else {
                                System.out.println("La posicion que ingreso no esta disponible");
                            }
                            break;
                        case 3:

                            break;
                    }
                    break;
                case 4:
                    System.out.println("1. Agregar\n"
                            + "2. Lista\n"
                            + "3. Modificar");
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese la posicion de la corporacion que desea cambiar");
                            int p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                ArrayList<modelos> numeroDeModelos = new ArrayList();
                                System.out.println("Ingrese la posicion de la marca que desea agregar");
                                int po = sc.nextInt();
                              /*  if (p <= Corporaciones.get(p).getMarcas().getNumeroDeModelos().size()) {
                                    System.out.println("Ingrese el nombre del modeli");
                                    String nombre2 = sc.next();
                                    System.out.println("Ingrese el año de fabricacion");
                                    int anoDeFabricacion = sc.nextInt();
                                    System.out.println("Ingrese el motor");
                                    String motor = sc.next();
                                    System.out.println("Ingrese el Cilindra da motor");
                                    double Cilindradamotor = sc.nextDouble();
                                    System.out.println("Ingrese el precio");
                                    double precio = sc.nextDouble();
                                    System.out.println("Ingrese la tecnologia");
                                    String tecnologia = sc.next();
                                    numeroDeModelos.add(new modelos(nombre2, anoDeFabricacion, motor, Cilindradamotor, precio, tecnologia));
*/

                                

                            } else {
                                System.out.println("La posicion que ingreso no esta disponible");
                            }
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                    }
                    break;
                case 5:
                    System.out.println("1. Agregar\n"
                            + "2. Listar\n"
                    );
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese la posicion de la corporacion que desea agregar una division tecnologica");
                            int p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                ArrayList<String> techYaDesarrollada = new ArrayList();
                                System.out.println("Ingrese el nombre de la division");
                                String nombre = sc.next();
                                System.out.println("Ingrese el ano de creacion");
                                int anoDeCreacion = sc.nextInt();
                                System.out.println("Ingrese el campo de dedicacion");
                                String campo = sc.next();
                                char resp = 's';
                                while (resp == 's') {
                                    System.out.println("Ingrese el tech ya desarollado");
                                    String tech = sc.next();
                                    techYaDesarrollada.add(tech);
                                    System.out.println("Desea ingresar otro tech?[s/n]");
                                    resp = sc.next().charAt(0);
                                }
                                Corporaciones.get(p).getDivisionestecnologicas().add(new divisionTecnologica(nombre, anoDeCreacion, campo, techYaDesarrollada));
                            } else {
                                System.out.println("La posicion que ingreso no tiene Corporacion");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la posicion de la corporacion que desea ver sus divisiones");
                            p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                System.out.println(Corporaciones.get(p).getDivisionestecnologicas());
                            } else {
                                System.out.println("La posicion que ingreso no tiene divisiones");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la posicion de la corporacion que desea modificar las marcas");
                            p = sc.nextInt();
                            if (p <= Corporaciones.size()) {
                                System.out.println("Ingrese la posicion de la division que desea cambiar");
                                int po = sc.nextInt();
                                if (p <= Corporaciones.get(p).getDivisionestecnologicas().size()) {
                                    ArrayList<String> techYaDesarrollada = new ArrayList();
                                    System.out.println("Ingrese el nombre de la division");
                                    String nombre = sc.next();
                                    System.out.println("Ingrese el ano de creacion");
                                    int anoDeCreacion = sc.nextInt();
                                    System.out.println("Ingrese el campo de dedicacion");
                                    String campo = sc.next();
                                    char resp = 's';
                                    while (resp == 's') {
                                        System.out.println("Ingrese el tech ya desarollado");
                                        String tech = sc.next();
                                        techYaDesarrollada.add(tech);
                                        System.out.println("Desea ingresar otro tech?[s/n]");
                                        resp = sc.next().charAt(0);
                                    }
                                    Corporaciones.get(p).getDivisionestecnologicas().get(po).setAñoDeCreacion(anoDeCreacion);
                                    Corporaciones.get(p).getDivisionestecnologicas().get(po).setCampoDedicaion(campo);
                                    Corporaciones.get(p).getDivisionestecnologicas().get(po).setNombre(nombre);
                                    Corporaciones.get(p).getDivisionestecnologicas().get(po).setTechYaDesarrollada(techYaDesarrollada);
                                } else {
                                    System.out.println("La posicion que ingreso no esta disponible");
                                }
                            } else {
                                System.out.println("La posicion que ingreso no esta disponible");
                            }
                            break;
                    }
                    break;
                case 6:
                    for (Object C : Corporaciones) {
                        System.out.println(Corporaciones.indexOf(C) + " - " + C);
                    }
                                        break;
                case 7:{
                
                System.out.println("===============corporaciones================");
                    for (int i = 0; i < Corporaciones.size(); i++) {
                        //System.out.println(i +"-" +corporaciones.get(i).getNombre());
                    }
                    System.out.println("Ingresa la posicion de la corporacion que deseas modificar");
                    int resp = sc.nextInt();
                    if (Corporaciones.size() >= resp) {

                        System.out.println("Indique que desea modificar: \n"
                                + "1.Nombre\n"
                                + "2.Sede\n"
                                + "3.anio de fundacion\n"
                                + "4.nombre de ceo\n"
                                + "5.numero de empleados\n"
                                + "6.cantidad de autos que se pueden fabricar\n"
                                + "7.Modelos\n"
                                + "8.Fabricas\n"
                                + "9.division tecnologica");
                        int resp5 = sc.nextInt();
                        switch (resp5) {
                            case 1: {
                                System.out.println("Ingrese el nombre de la corporacion: ");
                                String nombre2 = sc.next();
                                Corporaciones.get(resp).setNombre(nombre2);
                                break;
                            }
                            case 2: {
                                System.out.println("Ingrese la sede de la corporacion");
                                String sede2 = sc.next();
                                Corporaciones.get(resp).setSede(sede2);
                                break;
                            }
                            case 3: {
                                System.out.println("Ingrese el año de fundación");
                                int fundacion2 = sc.nextInt();
                                Corporaciones.get(resp).setAño(fundacion2);
                                break;
                            }
                            case 4: {
                                System.out.println("Ingrese el nombre del CEO o Presidente: ");
                                String CEO2 = sc.next();
                                Corporaciones.get(resp).setCeo(CEO2);
                                break;
                            }
                            case 5: {
                                System.out.println("Ingrese el numero total de empleados");
                                int empleados2 = sc.nextInt();
                                Corporaciones.get(resp).setCantEmpleados(empleados2);
                                break;
                            }
                            case 6: {
                                System.out.println("Ingrese la cantidad de autos que se pueden fabricar");
                                int autosfabricados2 = sc.nextInt();
                                Corporaciones.get(resp).setCantAutos(autosfabricados2);
                                break;
                            }
                            case 7: {
                                for (int i = 0; i < Corporaciones.get(resp).getMarcas().size(); i++) {
                                    System.out.println(i + "-" + Corporaciones.get(resp).getMarcas().get(i));
                                }
                                System.out.println("ingrsa pos que quieres modificar");
                                int marcas = sc.nextInt();
                                if (Corporaciones.get(resp).getMarcas().size() >= marcas) {
                                    System.out.println("Ingrese el nombre de la marca");
                                    String nombreMarca2 = sc.next();
                                    System.out.println("Ingrese el lems");
                                    String lema2 = sc.next();
                                    System.out.println("Ingrese el año de fundación");
                                    int anoDeFundacion2 = sc.nextInt();
                                    System.out.println("Ingrese el año de Integracion");
                                    int anoDeIntegracion2 = sc.nextInt();
                                    System.out.println("Ingrese el nombre del fundador");
                                    String fundado2r = sc.next();
                                    System.out.println("Ingrese el numero de ventas anuales");
                                    double ventasAnuales2 = sc.nextDouble();
                                    System.out.println("Ingrese el nombre del presidente");
                                    String presidente2 = sc.next();
                                    System.out.println("ingresa cantidad de modelos");
                                    int cantid = sc.nextInt();
                                    char respv = 's';

                                    while (respv == 's' || respv == 'S') {
                                        System.out.println("Ingrese el nombre del modelo: ");
                                        String nombre2 = sc.next();
                                        System.out.println("Ingrese el año de fabricacion");
                                        int añoDeFabricacion2 = sc.nextInt();
                                        System.out.println("Ingrese el motor: ");
                                        String motor2 = sc.next();
                                        System.out.println("Ingrese la cilindrada del motor");
                                        double cilindradaDelMotor2 = sc.nextDouble();
                                        System.out.println("Ingrese el precio");
                                        double precio2 = sc.nextDouble();
                                        System.out.println("Ingrese la tecnologia: ");
                                        String tecnologia2 = sc.next();
                                        models.add(new modelos(nombre2, añoDeFabricacion2, motor2, cilindradaDelMotor2, precio2, tecnologia2));
                                        System.out.println("desea agregar otro modelo?");
                                        respv = sc.next().charAt(0);

                                    }
                                    Corporaciones.get(resp).getMarcas().get(0).setNumeroDeModelos(models);

                                } else {
                                    System.out.println("no hay en esa posicion");
                                }//validacion 

                                break;
                            }//case de marcas
                            case 8: {
                                char respk = 's';
                                while (respk == 's' || respk == 'S') {

                                    System.out.println("Ingrese el nombre de la fabrica");
                                    String nombre3 = sc.next();
                                    System.out.println("Ingrese la ubicacion de la fabrica");
                                    String ubicacion = sc.next();
                                    System.out.println("Ingrese el cantidad Maxima De Modelos");
                                    int cantidadMaximaDeModelos = sc.nextInt();
                                    System.out.println("Ingrese el cantidad de empleados");
                                    int cantidadDeEmpleados = sc.nextInt();
                                    System.out.println("Ingrese el cantidad cantidad De Autos Actualmente fabricados");
                                    System.out.println("Carroceria mas fabricada(sedán, hatchbacko coupé)");
                                    String c = sc.next();
                                    int cantidadDeAutosActualmente = sc.nextInt();
                                    Corporaciones.get(resp);
                                    for (int i = 0; i < Corporaciones.get(resp).getMarcas().size(); i++) {
                                        System.out.println(i + "" + Corporaciones.get(resp).getMarcas().get(i));
                                    }
                                    System.out.println("ingresa la posicione de la  marca para añadirla a las marcas fabricadas");
                                    int DeMarcas1 = sc.nextInt();
                                    String nombresDeMarca2 = Corporaciones.get(resp).getMarcas().get(DeMarcas1).getNombre();
                                    fabricas.add(new fabricas(nombre3, ubicacion, cantidadMaximaDeModelos, c, cantidadDeEmpleados, nombresDeMarca2, cantidadDeAutosActualmente));
                                    System.out.println("ingresar otra fabrica?s/n");
                                    respk = sc.next().charAt(0);
                                }
                                Corporaciones.get(resp).setFabricas(fabricas);

                                break;
                            }
                            case 9: {
                                ArrayList<String> techYaDesarrollada = new ArrayList();
                                ArrayList<divisionTecnologica>  Divisionestecnologicas =  new ArrayList();
                                char respj = 's';
                                while (respj == 's' || respj == 'S') {
                                    System.out.println("Ingrese el nombre de la division");
                                    String nombre6 = sc.next();
                                    System.out.println("Ingrese el ano de creacion");
                                    int anoDeCreacion = sc.nextInt();
                                    System.out.println("Ingrese el campo de dedicacion");
                                    String campo = sc.next();
                                    char respb = 's';
                                    while (respb == 's') {
                                        System.out.println("Ingrese el tech ya desarollado");
                                        String tech = sc.next();
                                        techYaDesarrollada.add(tech);

                                        System.out.println("Desea ingresar otro tech?[s/n]");
                                        respb = sc.next().charAt(0);
                                    }
                                    System.out.println("Agregar otra division de tecnologia?");
                                    respj = sc.next().charAt(0);
                                    Divisionestecnologicas.add(new divisionTecnologica(nombre6, anoDeCreacion, campo, techYaDesarrollada));

                                }//while de tecnologia;

                                break;
                            }

                        }//switch de modificar corp
                    } else {
                        System.out.println("No se encuentra nada en esa posicion");
                    }//validacion
                
                
                }

            }
          
        

        }
    }

}
