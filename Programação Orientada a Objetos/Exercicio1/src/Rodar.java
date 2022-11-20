public class Rodar {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setTanque(59);
        System.out.println(carro1.totalValorTanque(6.37));

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getTanque());

        Carro carro2 = new Carro("verde", "FERRARI", 90);


        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getTanque());
        System.out.println(carro2.totalValorTanque(6.37));




    }
}
