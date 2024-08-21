/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_perfecto;

/**
 *
 * @author SCIS3-21
 */
import java.util.Scanner;

public class NumeroPerfecto {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es perfecto
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }

    // Método para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        // Si el número es menor o igual a 0, no puede ser perfecto
        if (numero <= 0) {
            return false;
        }
        
        int sumaDivisores = 0;
        
        // Encontrar la suma de los divisores propios
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        
        // Comparar la suma de los divisores con el número original
        return sumaDivisores == numero;
    }
}

