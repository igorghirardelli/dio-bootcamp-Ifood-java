import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        System.out.println("Informe uma nota");
        nota = teclado.nextInt();
        while(nota < 0 | nota >10){
            System.out.println("Nota invalida");
            nota  = teclado.nextInt();

        }




    }
}
