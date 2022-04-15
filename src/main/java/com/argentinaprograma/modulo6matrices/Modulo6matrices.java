/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.argentinaprograma.modulo6matrices;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Modulo6matrices {

    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("¿Que ejercicio quieres ejecutar?");
        System.out.println(" ****************************** ");
        System.out.println(" 1 --> Ejercicio1: promedio de goles por jugador");
        System.out.println(" 2 --> Ejercicio2: promedio de notas por alumno");
        System.out.println(" 3 --> Ejercicio3: generar matriz cuadrada");
        System.out.println(" 4 --> Ejercicio4: platos y acompañamientos");
        System.out.println(" 5 --> Ejercicio5: horas extras");
        System.out.println(" 0 --> Salir");
        System.out.println(" ******************************");
        
        Scanner teclado = new Scanner(System.in);
        String tecla = teclado.nextLine();
        
        switch(tecla){
            case "1":
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.run();
                break;        
            
            case "2":
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.run();
                break;        
        
            case "3":
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.run();
                break;        
            
            case "4":
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.run();
                break;        
            
            case "5":
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.run();
                break;    
                
            default:
                System.out.println("Bye!");    
                break;
        }
        
    }
}
