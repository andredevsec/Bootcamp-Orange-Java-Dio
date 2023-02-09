package PolimorfismoSobrescrita;

public class Main {
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2 (), new ClasseMae() };

        // polimorfico
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        // trabalhando diretamente com o tipo, ocorre sobreescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
    
}
