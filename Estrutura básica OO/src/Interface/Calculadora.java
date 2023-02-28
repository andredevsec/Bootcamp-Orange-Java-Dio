package Interface;

public class Calculadora implements OperacaoMatematica {
    
    @Override
    public void soma(double operando1, double opreando2) {
        System.out.println("Soma: " + (operando1 + opreando2));
    }

    @Override
    public void subtracao(double operando1, double opreando2) {
        System.out.println("Soma: " + (operando1 - opreando2));
    }

    @Override
    public void multiplicacao(double operando1, double opreando2) {
        System.out.println("Soma: " + (operando1 * opreando2));
    }

    @Override
    public void divisao(double operando1, double opreando2) {
        System.out.println("Soma: " + (operando1 / opreando2));
    }

}
