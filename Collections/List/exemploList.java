package Collections.List;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class exemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione suas notas");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.8);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0:" + notas.indexOf(5d)); //indexOf nos da a posição da nota

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0); //Passnado 4 como posição e 8.0 como valor
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //usa indexOf para char a posição do valor a ser substituido e passa o valor
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); // metodo countais e utilizado para ver se tem ou nao o elemenmto, retorna valor booleano
        
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // Collections.min e um metodo utilizado para achar o valor minimo
        System.out.println("Exiba a maior nota: " + Collections.max(notas)); // Collections.max e um metodo utilizado para achar o valor máximo

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next; 
        }

        System.out.println("Exiba a soma dos valores" + soma);

        System.out.println("Exiba a soma das notas: " + (soma/notas.size())); // size e utilizado para contar o numero de elementos de uma lsita

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // se eu nao colocar o d no final, remove o elemento da posição 0

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);

        System.out.println("Removas as nota que são menores do que 0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear(); // clear e o metodo que apaga toda a lista
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // is Empty e um meotdo boleano e verifica se a lista esta vazia ou não
        
    }
}
