import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // OPERADORES DE ATRIBUIÇÃO
        System.out.println("OPERADORES DE ATRIBUIÇÃO");
        String nome = "André";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //************************************************************************** */
        //OPERADORES ARITIMETICOS
        System.out.println("OPERADORES ARITIMETICOS");
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20*7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // resto da divisao e o resultado
        double resultado = (10*7) + (20/4); 
        // operador + em string faz concatenação dos textos "Andre" + "luiz" = Andre luiz
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";// apos detectar um caracter ele entende concatenação

        concatenacao = 1+"1"+1+1; // apos ler "" ele entende como texto as seguintes

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);//primeiro realiza a soma das evidencias

        //********************************************************************************** */
        //OPERADORES UNÁRIO

        System.out.println("OPERADORES UNÁRIO");
        int numero = 5;

        System.out.println(-numero);//operador de negação nao afetou variavei principal
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);
        
        numero = numero * -1;
        System.out.println(numero);

        //******************************************************************************************* */
        //OPERAÇÕES A INCREMENTO DE NUMERO
        //x repetição
        System.out.println("OPERAÇÕES A INCREMENTO DE NUMERO");
        int N = 6;
        N++;//soma +1
        System.out.println(N);
        System.out.println(N++); // nao contece nada pois operação sendo feita dentro do sout
        System.out.println(++N); //operação acontece pois vai incrementar antes dde usar a variavel
        System.out.println(N);
        System.out.println(--N);//decrementar
        System.out.println(N--);

        boolean variavel = false; // ou true
        System.out.println(!variavel);// ficara false pois ! negação
        //outra maneira seia
        variavel = !variavel;

        //********************************************************************************************* */
        //OPERADOR TERNÁRIO
        System.out.println("OPERADOR TERNÁRIO");
        int a, b;
        a = 10;
        b = 15;
        //e uma expressão boleana
        String R = a==b ? "verdadeiro" : "falso";
        
        // if(a==b)
        //     R = "verdadeiro";
        // else
        //     R = "falso";  
        
        System.out.println(R);

        //**************************************************************************************** */
        //OPERADORES RELACIONAIS : AVALIAR CONDIÇÃO DA EXPRESSÃO
        // ==   !=  >   >=  <   <=
        System.out.println("OPERADORES RELACIONAIS");
         int numero1 = 1;
         int numero2 = 2;

         String nomeUm = "André";
         String nomeDois = "André";
         
         System.out.println(nomeUm.equals(nomeDois));

         boolean simNao = numero1 == numero2;
        
         if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
         }

         System.out.println("numero Um é igual a numeroDois? " + simNao);

         simNao = numero1 != numero2;
         System.out.println("numero Um é diferente a numeroDois? " + simNao);

         simNao = numero1 > numero2;
         System.out.println("numero Um é maior a numeroDois? " + simNao);

         simNao = numero1 < numero2;
         System.out.println("numero Um é menor a numeroDois? " + simNao);
        
         //********************************************************************************* */
         //OPERADORES LOGICOS
         // && "e"  || "ou"
         System.out.println("OPERADORES LOGICOS");
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        else{
            System.out.println("essa condição e falsa");
        }

        if(condicao1 || condicao2){
            System.out.println("a condição 1 ou a condição 2 é verdadeira");
        }

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("fim");

    }
}
