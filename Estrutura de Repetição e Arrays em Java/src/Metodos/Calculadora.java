package Metodos;

public class Calculadora {

    double numero1, numero2;
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A soma de " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A soma de " + numero1 + " x " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A soma de " + numero1 + " / " + numero2 + " = " + resultado);
    }
    
}
