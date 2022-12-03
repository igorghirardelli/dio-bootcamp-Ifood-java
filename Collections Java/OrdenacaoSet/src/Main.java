import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("Ordem aleatoria");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got","guerra",60 ));
            add(new Serie("vikings","medieval",54));
            add(new Serie("spn","terror",55));
        }};

        for(Serie serie: minhasSeries){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+ " - "+ serie.getTempo() );
        }

        System.out.println("Ordem de inserção ");
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("got","guerra",60 ));
            add(new Serie("vikings","medieval",60));
            add(new Serie("spn","terror",55));
        }};

        for(Serie serie: minhasSeries1){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+ " - "+ serie.getTempo() );
        }

        System.out.println("Ordem natural (tempo de episodio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie: minhasSeries2){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+ " - "+ serie.getTempo() );
        }

        System.out.println("Ordem nome/genero/tempo");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie: minhasSeries3){
            System.out.println(serie.getNome()+" - "+serie.getGenero()+ " - "+ serie.getTempo() );
        }







    }
}
class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempo;

    public Serie(String nome, String genero, Integer tempo) {
        this.nome = nome;
        this.genero = genero;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempo.equals(serie.tempo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempo);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempo(), serie.getTempo());
        if(tempoEpisodio != 0) return tempoEpisodio;

        return  this.getGenero().compareTo(serie.getGenero());



    }
}
class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome  = s1.getNome().compareTo(s1.getNome());
        if(nome != 0) return nome;


        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempo(), s2.getTempo());
    }
}