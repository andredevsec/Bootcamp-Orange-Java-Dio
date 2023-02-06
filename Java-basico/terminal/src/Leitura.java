import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Difite seu nome");
        String nome = scanner.next();

        System.out.println("Difite seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);

        System.out.println("Minha altura é " + altura + "cm ");
    }
}
