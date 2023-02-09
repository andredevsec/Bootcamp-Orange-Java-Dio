package UpDownCast;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //Downcast = Gerente gerente = new Funcionario();

        Vendedor veendedor = (Vendedor) new Funcionario();
    }
    
}
