/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo_2;

import java.util.Scanner;


public class Algoritmo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      Scanner src = new Scanner(System.in);
      
      
        System.out.println("Ingrese el número:");
        int numero = src.nextInt();
        long inicio = System.nanoTime();
      
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }
        
        int sumaDivisores = 0;
        for (int i = 1; i <= numero /2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
          
        if (sumaDivisores == numero) {
            System.out.println("El número " + numero + " es un número perfecto.");
        } else {
            System.out.println("El número " + numero + " no es un número perfecto.");
        }
        
        long fin = System.nanoTime();
        
        long tiempo = (fin - inicio);
  
        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
    }
}
    

