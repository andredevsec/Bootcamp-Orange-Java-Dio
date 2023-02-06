public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.soma(7, 8);
        Calculadora.soma(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagen(8);
        Mensagem.obterMensagen(14);
        Mensagem.obterMensagen(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(100, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(100, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
    
}
