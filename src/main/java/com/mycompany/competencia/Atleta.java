
package com.mycompany.competencia;

import java.util.Scanner;

/**
 *
 * @author The fear of blood tends to create fear for the flesh
 */
public class Atleta {
    private String nombre;
    private String nacionalidad;
    private double tiempo;
    
    public Atleta(String nombre, String nacionalidad, double tiempo){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.tiempo=tiempo;
    }
    public Atleta(){
        nombre="";
        nacionalidad="";
        tiempo=0.0;
    }
    
    public double getTiempo(){
        return tiempo;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public void datosAtleta(){
        System.out.println("nombre: "+nombre);
        System.out.println("nacionalidad: "+nacionalidad);
        System.out.println("tiempo: "+tiempo);
    }
    
}
