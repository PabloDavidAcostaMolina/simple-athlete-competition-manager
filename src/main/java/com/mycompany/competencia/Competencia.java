
package com.mycompany.competencia;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The fear of blood tends to create fear for the flesh
 */
public class Competencia {
    
    private ArrayList<Atleta> ListaAtletas;
    
    public Competencia(ArrayList<Atleta> ListaAtletas){
        this.ListaAtletas=ListaAtletas;
    }
    
    public ArrayList getListaAtletas(){
        return ListaAtletas;
    }
    
    public void registrarAtleta(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite nombre del atleta");
        String nom=entrada.nextLine();
        
        System.out.println("digite nacionalidad del atleta ");
        String nac=entrada.nextLine();
        String nacion;
        nacion = nac.toUpperCase();
        
        System.out.println("digite tiempo de atleta");
        double tiem=entrada.nextDouble();
        
        //entrada.close();
        
        Atleta a1=new Atleta(nom,nacion,tiem);
        System.out.println("atleta creado ");
        
        ListaAtletas.add(a1);
        System.out.println("atleta registrado con exito");
    }
    public void mostrarAtletas(){
        for(int i=0;i<ListaAtletas.size();i++){
            ListaAtletas.get(i).datosAtleta();
        }
    }
    
    public void datosCampeon(){
        Atleta campeon= new Atleta();
        campeon = ListaAtletas.get(0);
        for(int i=0;i<ListaAtletas.size();i++){
            if(ListaAtletas.get(i).getTiempo()<campeon.getTiempo()){
                campeon=ListaAtletas.get(i);
            }
        }
        System.out.println("los datos del campeon son: ");
        campeon.datosAtleta();
    }
    
    public void atletasPais(String pais){
        pais = pais.toUpperCase();
        System.out.println("atletas del pais: "+pais);
        for(int i=0;i<ListaAtletas.size();i++){
            if(ListaAtletas.get(i).getNacionalidad().equals(pais)){
                ListaAtletas.get(i).datosAtleta();
            }
        }
    }
    
    public double promedioTiempo(){
       double acum=0.0;
       for(int i=0;i<ListaAtletas.size();i++){
           acum += ListaAtletas.get(i).getTiempo();
       }
       double prom = acum/ListaAtletas.size();
       DecimalFormat dec = new DecimalFormat("#.00");
        //System.out.println("tiempo promedio: "+prom);
        System.out.println(dec.format(prom));
       return prom;
    }
    
}
