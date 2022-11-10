import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] matriz = new int[4][4];

        for(int i = 0; i< matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j] = random.nextInt(9);
            }
        }


        for(int i = 0; i<matriz.length;i++) {// mostrar a matriz
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            }

        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        System.out.print(nomes.length);





        }



    }

