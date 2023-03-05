package Collections.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Dados as seguintes informações sobre gatos, crie uma lista e ordene
 * essa lista exibindo (nome - idade - cor);
 * 
 * Gato1 -= nome: Jon, idade: 18, cor: preto
 * Gato2 -= nome: Simba, idade: 6, cor: branco
 * Gato3 -= nome: Jon, idade: 18, cor: preto
 */

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato ("Jon", 18, "preto"));
            add(new Gato ("Simba", 8, "branco"));
            add(new Gato ("Jon", 12, "amarelo"));
        }};

        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatoria");
        Collections.shuffle(meusGatos); // shuffle metodo collections que imprime em ordem aleatoria
        System.out.println(meusGatos);

        System.out.println("Ordem Natural"); // É usado o metodo CompareTo na classe gato
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Idade");
        Collections.sort(meusGatos, new ComparatorIdade()); //Classe criada para comparar os gatos
        // meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/ Cor/ Idade");
        meusGatos.sort(new ComparatorNomeCorIdade()); // se o nome e igual comparar pelça cor, assim sucessivamente
        System.out.println(meusGatos);
        
    }
    
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato (String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome () {
        return nome;
    }

    public int getIdade () {
        return idade;
    }

    public String getCor () {
        return cor;
    }

    @Override
    public String toString () {
        return "Gato { " + "nome: " + nome + ", idade: " + idade + ", cor: " + cor + " }";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome()); 
    }    

}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare (Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
        }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare (Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare (Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (nome != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}

