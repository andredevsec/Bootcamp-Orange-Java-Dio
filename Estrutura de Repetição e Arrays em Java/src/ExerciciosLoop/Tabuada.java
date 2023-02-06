package ExerciciosLoop;

import java.util.Scanner;

/*
    Desenvolva um gerador de tabuada,
    capaz de gerar uma tabuada de qualquer número inteiro entre 1 a 10.
    O usuário deve informar de qual número ele deseja ver a tabuada.
    A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 x 1 = 5
    5 x 2 = 10
    ...
    5 x 10 = 50
*/

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int numero = scan.nextInt();

        if(numero <= 10)
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        } else {
            System.out.println("Numero invalido");
        }

    }
    
}
