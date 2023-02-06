public class Logicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2  = " + (b1 && b2)); // conjunção, ou e, quando amobs sao true
        System.out.println("b1 && b3 = " + (b1 && b3));

        System.out.println("b2 || b3 = " + (b2 || b3));// dijunção,ou ou, so e falso quando os dois são falso
        System.out.println("b2 || b4 = " + (b2 || b4));
        
        System.out.println("b1 ^ b3 = " + (b1 ^ b3));// dinjunção exclusiva ou xor, so é true quando eles são diferentes
        System.out.println("b4 ^ b1 = " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;

        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true = " + ((i1 + i2) < (f2 - f1) && true)); // criando expressão com operador aritimetico, relacional e logico, ambos sao true
        System.out.println("((i1 > i2) || (f2 < f1)) && true = " + ((i1 > i2) || (f2 < f1) && true));

        //criando variaveis intermediarias para diminuir expressões
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); //não precisa de toda essa expressão, criando variaveis intermediarias como abaixo

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio = " + recebeAuxilio);


    }
    
}
