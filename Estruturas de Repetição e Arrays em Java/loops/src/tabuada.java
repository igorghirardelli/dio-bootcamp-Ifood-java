import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Informe o valor para a tabuada: ");
        num = teclado.nextInt();

        for(int i =1; i <=10;i++){
            //System.out.println("Tabuada do: "+num);
            System.out.println(num+ " x " +i+ " = ");
            System.out.println(i * num);
        }

    }
}
