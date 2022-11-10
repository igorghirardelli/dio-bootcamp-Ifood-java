import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int fatorial;

        System.out.println("Fatorial: ");
        fatorial = teclado.nextInt();

        int multlicar = 1;
        for(int i = fatorial; i>=1;i--){

            multlicar *=i;
            System.out.print(i+ " . ");
        }

        System.out.print("1 = "+multlicar);
        System.out.println("");


    }
}
