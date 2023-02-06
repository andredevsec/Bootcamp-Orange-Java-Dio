package Arrays;

import java.util.Scanner;

/*
    Faça um Programa que leia um vetor de 6 caracteres,
    e diga quantas foram atendidas foram lidas.
    Imprima as consoantes.
*/

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantidade = 0;

        int cont = 0;
        do{ 
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if(! (letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                    consoantes[cont] = letra;
                    quantidade++;
                }
                cont++;
        }while(cont < consoantes.length);

        System.out.println("Consoantes");
        for (String consoante : consoantes ) {
            if( consoante != null)
            System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidade);
    }
    
}
