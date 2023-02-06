package ExerciciosLoop;

import java.util.Scanner;

/*
    Faça um programa que leia 5 números
    e informe o maior número
    ea média números desses.
*/

public class MaiorEMedia {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero; 
        int maior = 0;
        int soma = 0;

        int cont = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero/5; //realizando a media, soma inicia em 0 e adiciona o valor do numero que tem 5 elementos

            if(numero > maior) maior = numero; // encontrando maior numero se colocar fora do laço, so mostra quando encerrar o laço

            cont = cont+1;           

        } while(cont < 5);
        System.out.println("O maior numero é: " + maior);
        System.out.println("O média é: " + soma);
    }
}
