import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione  as setes notas ");

        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));


        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8.0); // colocar a nota 8.0 na posicao 4 antes era 7 agr 8
        System.out.println(notas);


        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // trocar a nota 5.0 pela nota 6.0

        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: "+notas.contains(5d));

        //System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
       // for(double nota: notas){
        //    System.out.println(nota);
      //  }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // exibir a terceira nota adicionada
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // menor nota

        System.out.println("Exiba a maior nota: "+ Collections.max(notas)); // maior nota


        Iterator<Double> iterator = notas.iterator();
        double soma  = 0d;

        while(iterator.hasNext()){
            double next = iterator.next();
            soma+= next;
        }
        System.out.println("Exiba a soma de valores: "+soma);

        System.out.println("Exiba a media das notas: "+(soma/notas.size()));

        System.out.println("Remova a nota 0");
        notas.remove(0d); //  remover a nota 0 da lista

        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0); // remover a nota da POSIÇÃO 0
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){  // vai perguntar se tem o proximo numero
           double next =  iterator1.next();
           if(next < 7){
               iterator1.remove(); //  remover as notas abaixo de 7
           }
        }

        System.out.println(notas);

        System.out.println("Apague toda a lista ");
        notas.clear(); // limpar toda a lista
        System.out.println(notas);

        System.out.println("Confira se a lista esta realmente vazia: "+notas.isEmpty()); // ele retorna true ou false




    }
}