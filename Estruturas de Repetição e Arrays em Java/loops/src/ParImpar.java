import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdnumeros;
        int numero;
        int qtdpar=0;
        int qtdimpar=0;


        System.out.println("Quantidade de numeros: ");
        qtdnumeros = teclado.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = teclado.nextInt();

            if(numero%2==0){

                qtdpar++;
            }else{

                qtdimpar++;
            }

            count+=1;
        } while(count < qtdnumeros);


        System.out.println("Quantidade de numeros pares: "+qtdpar);
        System.out.println("Quantidade de numeros impares: "+qtdimpar);

    }
}
