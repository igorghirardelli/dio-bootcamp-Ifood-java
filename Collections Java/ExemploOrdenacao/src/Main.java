import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Ordem aleatoria ");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Antonio, Bandeira", new Livro("GatoDeBotas", 256));
            put("Balar, nico", new Livro("VentoLevou", 333));
            put("Chaverinho, swan", new Livro("AmargoDoce", 244));
            put("Dumb, faker", new Livro("ruller", 155));
        }};
        for(Map.Entry<String,Livro> livro :meusLivros.entrySet())
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());


        System.out.println("Ordem de insercao: ");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Antonio, Bandeira", new Livro("GatoDeBotas", 256));
            put("Balar, nico", new Livro("VentoLevou", 333));
            put("Chaverinho, swan", new Livro("AmargoDoce", 244));
            put("Dumb, faker", new Livro("ruller", 155));
        }};
        for (Map.Entry<String,Livro>  livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey()+ " - "+ livro.getValue().getNome());
        }

        System.out.println("Ordem alfabetica autores ");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);

        for(Map.Entry<String,Livro> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey()+ " - "+ livro.getValue().getNome());
        }

        System.out.println("Ordem alfabetica nomes dos livros ");

        Set<Map.Entry<String, Livro>> meusLivros3  = new  TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);

        for(Map.Entry<String,Livro> livro: meusLivros3) {
            System.out.println(livro.getKey()+ " - "+ livro.getValue().getNome());
        }

        System.out.println("Ordem de numero de paginas: ");




        Set<Map.Entry<Integer,Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros4);

        for(Map.Entry<Integer,Livro> livro: meusLivros4) {
            System.out.println(livro.getKey()+ " - "+ livro.getValue().getPaginas());
        }









    }
}
class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas='" + paginas + '\'' +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
class ComparatorPagina implements Comparator<Map.Entry<Integer,Livro>>{

    @Override
    public int compare(Map.Entry<Integer, Livro> l1, Map.Entry<Integer, Livro>l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}