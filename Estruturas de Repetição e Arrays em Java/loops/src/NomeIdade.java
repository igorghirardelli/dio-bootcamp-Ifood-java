import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = teclado.next();
            if(nome.equals("0"))break;
            System.out.println("Idade: ");
            idade = teclado.nextInt();

        }


        System.out.println("Continua aqui..");






    }
}
