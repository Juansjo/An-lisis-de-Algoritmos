package algoritmo_talla;

import java.util.Random;

public class Algoritmo_Talla {

    public static void main(String[] args) {

        int m = 50; // 
        int[][] matriz = new int[m][m];

        long inicio = System.currentTimeMillis();

        llenarMatriz(matriz);
        imprimirMatriz(matriz);

        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;

        System.out.println("Tiempo de ejecucion: " + tiempoTranscurrido + " ms");

    }

    public static void llenarMatriz(int[][] matriz) {
        Random rand = new Random();
        int m = matriz.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        int m = matriz.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
