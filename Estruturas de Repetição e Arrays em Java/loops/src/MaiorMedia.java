import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0 ;


        int count = 0;

        do {

            System.out.println("Numero: ");
            numero = teclado.nextInt();

            soma+=numero;

            if(numero > maior)maior = numero;

            count +=1;

        }while(count < 5);

        System.out.println("A soma de todos os valores é:  "+soma);
        System.out.println("O numero maior é: "+maior);
    }
}
