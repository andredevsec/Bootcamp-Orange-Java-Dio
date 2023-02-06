package ExerciciosLoop;

import java.util.Scanner;

/*
    Faça um programa que calcula o fatorial de um número inteiro fornecido pelo usuário.
    Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("informe o numero fatorial");
        int fatorial = scan.nextInt();

        int multiplica =1;      
        
        for(int i = fatorial; i >= 1; i--){
            multiplica = multiplica *i;
            System.out.println(fatorial + " X " + i + " = " + ((multiplica)));
            }
        System.out.println(fatorial + "! = " + multiplica);  
    }
    
}
