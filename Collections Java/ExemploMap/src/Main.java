import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumo");
        Map<String, Double> carrosPopulares = new HashMap<>(){{

            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol",15.2 );
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson esta no dicionario: "+carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba a o consumo do uno: "+carrosPopulares.get("uno"));

        //System.out.println("Exiba o terceiro o modelo adicionado: ");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais economico: ");

        Double ConsumoEficiente =  Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String ModeloMaisEficiente = "";

        for (Map.Entry<String,Double> entry : entries ) {
            if(entry.getValue().equals(ConsumoEficiente)) {
                ModeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: "+ModeloMaisEficiente+" - " + ConsumoEficiente);

            }
        }



        System.out.println("Exiba o modelo menos economico e seu consumo: ");

        Double consumoMenosEficiente =  Collections.min(carrosPopulares.values());
        String ModeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet() ) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                ModeloMenosEficiente  = entry.getKey();
                System.out.println("Modelo menos economico "+ModeloMenosEficiente+" - "+consumoMenosEficiente);
            }

        }



        Iterator <Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: "+soma);

        System.out.println("Exiba a media dos consumos deste dicionario de carros: "+(soma/carrosPopulares.size()));

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15.6km: ");
        Iterator <Double> iterator1 = carrosPopulares.values().iterator();


        while(iterator1.hasNext()){
           if(iterator1.next().equals(15.6)){
               iterator1.remove();
           }
        }
        System.out.println(carrosPopulares);


        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{

            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();



        System.out.println("Confira se a lista esta vazia: "+carrosPopulares.isEmpty());


    }
}