package Arrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int[] numerosAleatorios = new int[20];

        for(int i =0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatorios");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessores numeros aleatorios");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("\nAntecessores numeros aleatorios");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1) + " ");
        }
    }
}
