
/*
Consigna:
 Una empresa constructora desea llevar a cabo un premio para sus obreros que 
hayan realizado horas extras en los últimos 6 meses. Para ello, lleva una matriz 
de control de 15 filas x 6 columnas, donde cada fila corresponde a un empleado 
distinto y donde cada columna representa el total de horas trabajadas por mes. 
El monto de horas normal trabajado x mes es de 8 horas diarias, 5 días a la semana, 
4 semanas por mes, es decir: 160 horas. Todo monto superior a este es considerado 
como horas extras.

Se desea un programa que permita la carga de horas trabajadas por cada obrero 
y que sea capaz de determinar aquellos que hayan realizado horas extras. 
Para registrar las horas extras realizadas se utilizará un vector de 15 
posiciones en donde se deberá calcular y almacenar la cantidad de horas 
extras de cada obrero. En caso de que no haya realizado horas extras, 
deberá incluirse un número 0. 
*/


package com.argentinaprograma.modulo6matrices;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Ejercicio5 {
    
    private final int NROWS = 15;
    private final int NCOLS = 6;
    private final int NORMALES = 160;
    private int extras[][]= new int[NROWS][NCOLS];
    Scanner teclado = new Scanner(System.in);
    
    public void run() {
        
        System.out.println("###########################################################################");
        System.out.println("# Este programa permite determinar qué empleados realizaron horas extras  #");
        System.out.println("#       en los últimos " + NCOLS + " meses, total y por mes.                          #");
        System.out.println("###########################################################################");
        System.out.println("");
        cargar();
        mostrarExtras();
        
    }
    
    public void cargar(){
        int tecla;
        System.out.println("Ingreso de horas trabajadas por mes.");
        System.out.println("");
        for (int i=0; i<NROWS; i++) {
            System.out.println("Empleado " + (i + 1));
            for (int j=0; j< NCOLS; j++) {
                System.out.println("Mes " + (j + 1));
                if(teclado.hasNextInt()){
                tecla= teclado.nextInt();
                extras[i][j]= gethorasExtras(tecla); //cargo horas extras o 0    
                }else{
                    System.out.println("Dato inválido. Reingrese");
                    j--;
                    teclado.next();
                }
            } 
        }
        
    }
    
    public int gethorasExtras(int horas){
        if(horas>NORMALES){
            horas-=NORMALES;
        }else{
            horas=0;
        }
        return horas;
    }
    
    public void mostrarExtras(){
        int totalExtras =0;
        
        System.out.println("----------------------------");
        System.out.println("Empleados con horas extras.");
        System.out.println("");
        for(int i=0; i<NROWS; i++){
            for(int j=0; j<NCOLS; j++){
                totalExtras+= extras[i][j];
            }
            if(totalExtras>0){
                System.out.println("");
                System.out.println("Empleado " + (i+1) + " tiene horas extras.");
                for(int k=0; k<NCOLS; k++){
                    System.out.println("Mes " + (k+1) + ": " + extras[i][k]);
                }
                System.out.println("Total Horas Extras: " + totalExtras);
                totalExtras=0;
            }
        }
    }
}