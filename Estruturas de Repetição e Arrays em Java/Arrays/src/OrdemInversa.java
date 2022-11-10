public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6};

        //System.out.println(vetor.length);

        int count = 0;
        System.out.print("Vetor: ");
        while(count<vetor.length){
            System.out.print(vetor[count] +" ");
            count++;
        }
        System.out.println();
        System.out.print("Vetor Invertido: ");
        for(int i =(vetor.length - 1);i >= 0; i--){
            System.out.print(vetor[i]+ " ");
        }

    }
}
