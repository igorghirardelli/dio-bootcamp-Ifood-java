import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosrandom = new int[20];

        for(int i = 0; i<numerosrandom.length;i++){
            int numero = random.nextInt(100);
            numerosrandom[i] = numero;

        }

        System.out.print("Numeros aleatorios: ");
        for(int numero : numerosrandom){
            System.out.print(numero+ " ");
        }

        System.out.println();

        System.out.print("Sucessores Numeros aleatorios: ");
        for(int numero : numerosrandom){
            System.out.print((numero+1)+ " ");
        }
        System.out.println();
        System.out.print("Antecessor dos Numeros aleatorios: ");
        for(int numero : numerosrandom){
            System.out.print((numero-1)+ " ");
        }
    }
}
