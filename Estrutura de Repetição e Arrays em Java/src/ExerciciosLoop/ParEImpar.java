package ExerciciosLoop;
import java.util.Scanner;

/*
    Faça um programa que peça N números inteiros,
    calcular e mostrar a quantidade de números pares
    e a quantidade de números impares.
*/

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
        
        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int cont = 0; //sempre a quantidade que o laço se repete
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero % 2 ==0) quantPares++ ;
            else quantImpares++ ;

            cont++ ; // cont = cont+1

            } while(cont < quantNumeros);

            System.out.println("Quantidade Par: " + quantPares);
            System.out.println("Quantidade Impar: " + quantImpares);
    }   
    
}
