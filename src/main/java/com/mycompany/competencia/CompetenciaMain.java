
package com.mycompany.competencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The fear of blood tends to create fear for the flesh
 */
public class CompetenciaMain {

    public static void main(String[] args) {
        System.out.println("competencia");
        ArrayList<Atleta> ListaAtletas = new ArrayList<>();
        Competencia c1 = new Competencia(ListaAtletas);

        
       Scanner entrada = new Scanner(System.in);
       int opcion;
       boolean salir = false;
       
       while(salir==false){
           System.out.println("///////////////////////////");
           System.out.println("1. Registrar Atleta");
           System.out.println("2. Datos del campeon");
           System.out.println("3. Atletas por pais");
           System.out.println("4. Tiempo promedio de los atletas");
           System.out.println("5. Salir");
           System.out.println("////////////////////////////");
           System.out.println("ingrese una opcion");
           opcion = entrada.nextInt();
           switch(opcion){
               case 1:
                   c1.registrarAtleta();
                   break;
                   
               case 2:
                   c1.datosCampeon();
                   break;
               case 3:
                   Scanner pa = new Scanner(System.in);
                   System.out.println("ingrese pais a buscar");
                   String pais =pa.nextLine();
                   c1.atletasPais(pais);
                   break;
               case 4:
                   c1.promedioTiempo();
                   break;
               case 5:
                   System.out.println("adios");
                   salir = true;
                   break;
               default:
                   System.out.println("Opcion no valida");
           }
       }
                    
        
    }
}
