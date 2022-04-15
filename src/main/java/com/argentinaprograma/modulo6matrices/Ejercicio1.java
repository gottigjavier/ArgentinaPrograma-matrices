
/*
Consigna:
Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos que jugaron, 
donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. Se necesita un programa que sea capaz 
de permitir la carga de los goles, calcular el promedio de goles realizado por cada jugador y almacenar el resultado en un 
vector de 5 posiciones, donde cada posición representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a 
cabo el planteo:

Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.
 */

package com.argentinaprograma.modulo6matrices;

/**
 *
 * @author gottig
 */
import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Ejercicio1 {
    
    private final int CANTJUGADORES = 5;
    private final int CANTPARTIDOS = 3;
    private final int goles[][]= new int[CANTJUGADORES][CANTPARTIDOS];
    private final double[] promedios = new double[CANTJUGADORES];
        
    public void run() {
        showHead();
        carga();
        promedio();
        mostrarPromedio();
    }
    
    public void showHead(){
        
        System.out.println("###########################################################################");
        System.out.println("# Este programa calcula el promedio de goles de " + CANTJUGADORES + " jugadores en " + CANTPARTIDOS + " partidos #");
        System.out.println("###########################################################################");
        System.out.println("");
    }
    
    public void carga(){
        System.out.println("Ingrese la cantidad de goles de cada jugador por partido");
        Scanner teclado = new Scanner(System.in);
        int tecla;
        for (int i= 0; i<CANTJUGADORES; i++){
            for(int j=0; j<CANTPARTIDOS; j++){
                System.out.println("Jugador " + (i+1) + " , Partido " + (j+1));
                try{
                    tecla = Integer.parseInt(teclado.nextLine());
                    goles[i][j]= tecla;    
                }
                catch (NumberFormatException ex){
                    System.out.println("Dato inválido");
                    j--;
                }
            }
        }
    }
    private void promedio(){
        double suma; // La declaro double para que la división del promedio sea double
        for (int i= 0; i<CANTJUGADORES; i++){
            suma=0.0;
            for(int j=0; j<CANTPARTIDOS; j++){
                suma+= goles[i][j];
            }
            promedios[i]= suma/CANTPARTIDOS; //Si suma fuera int la división serí entre enteros y arrojaría decimales=0
            // otra forma si suma fuera int -> promedios[i]= (double)suma/3;
        }
    }
    
    private void mostrarPromedio(){
        System.out.println("");
        System.out.println("Promedio de goles por jugador.");
        for (int i=0; i<CANTJUGADORES; i++){
            // Salida formateada -> printf Notar uso de + y de coma.
            System.out.printf("\nJugador [" + (i+1) + "]: %.2f", promedios[i]);
        }
    }
}

