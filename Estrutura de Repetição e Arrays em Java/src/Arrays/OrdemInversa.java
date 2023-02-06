package Arrays;

/*
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {
        
        int [] vetor = {0, -5, 51, 8 ,-9 ,-2};

        System.out.println("Vetor: ");
        int cont = 0; 
        while(cont < (vetor.length)) { //contador iniciando em 
            System.out.println(vetor [cont] + " ");
            cont++;
        }

        System.out.println("\n Vetor inverso: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor [i] + " ");
        }

    }
}
