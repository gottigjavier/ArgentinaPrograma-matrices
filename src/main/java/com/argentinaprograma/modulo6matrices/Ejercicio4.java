
/*
Consigna:
Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato del menú y sus correspondientes 
acompañamientos que contiene. Para ello, cada fila representa un plato principal en donde en la primera columna se especifica su 
nombre (por ejemplo: Milanesa), y en las demás los posibles acompañamientos que puede tener el plato (por ejemplo, puré, ensalada rusa, 
papas fritas, ensalada de lechuga y tomate, ensalada de zanahoria, etc). En caso de que tenga el plato menos de 4 tipos de 
acompañamiento, en la matriz se cargará la palabra Ninguno en las posiciones que queden vacías.

Se desea un programa que sea capaz de permitir la carga de la matriz, de buscar un plato en particular que un cliente ingrese por 
teclado y mostrarle de forma automática los posibles acompañamientos del mismo.  
*/


package com.argentinaprograma.modulo6matrices;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Ejercicio4 {
    
    private final int CANTPLATOS = 20;
    private final int CANTACOMPANAMIENTOS = 5;
    private String menu[][]= new String[CANTPLATOS][CANTACOMPANAMIENTOS+1];
    Scanner teclado = new Scanner(System.in);
    
    public void run() {
        System.out.println("##################################################################");
        System.out.println("# Este programa permite cargar un Menú y buscar Platos Ofrecidos #");
        System.out.println("##################################################################");
        System.out.println("");
        System.out.println("Cantidad de PLatos " + menu.length);
        System.out.println("Cantidad de Acompañamientos por Plato " + (menu[0].length -1));
        System.out.println("");
        load();
        showMenu();
        search();
    }

    public void load(){
        String tecla;
        System.out.println("Carga de Platos y Acompañamientos.");
        System.out.println("Enter para << Ninguno >>");
        System.out.println("----------------------------------");
        
        for(int i=0; i<menu.length; i++){
            System.out.println("Plato " + (i+1) + ": ");
            tecla = teclado.nextLine();
            if(!"".equals(tecla)){
                tecla = tecla.toLowerCase();
                menu[i][0]= tecla; // primera columna para platos
            }else{
                menu[i][0]= "ninguno";
            }
            for(int j=1; j<menu[0].length; j++){
                System.out.println("Acompañamiento " + j + ": ");
                tecla = teclado.nextLine();
                if(!"".equals(tecla)){
                    tecla = tecla.toLowerCase();
                    menu[i][j]= tecla; // primera columna para platos
                }else{
                    menu[i][j]= "ninguno";
                }
            }
        }
    }
    public void showMenu(){
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Menu Completo");
        System.out.println("");
        for(int i=0; i<menu.length; i++){
            System.out.println("Plato " + (i+1) + ": " + menu[i][0]);
            for(int j=1; j<menu[0].length; j++){
                System.out.println("Acompañamiento " + j + ": " + menu[i][j]);

            }
        }
        System.out.println("");
    }
    public void search(){
        String tecla;
        int index = -1;
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Ingrese el Plato a buscar: ");
        tecla = teclado.nextLine();
        tecla = tecla.toLowerCase();
        for(int i=0;i<menu.length; i++){
            if(menu[i][0].contentEquals(tecla)){
                index= i;
                break; //sale del ciclo for
            }
        }
        if(index!= -1 && !"ninguno".equals(menu[index][0])){
            System.out.println("Acompañamientos del Plato " + menu[index][0]);
            for(int i=1; i<menu[0].length; i++){
                System.out.println("- " + menu[index][i]);
            }
        }else{
            System.out.println("No servimos ese plato");
        }
        System.out.println("Fin del Programa");
    }
    
}