/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aboutme;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class AboutMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite seu nome ");
        String nome = teclado.next();
        
        System.out.println("Digite sua idade ");
        int idade = teclado.nextInt();
        
        System.out.println("Digite sua altura ");
        double altura = teclado.nextDouble();
    
        
        System.out.println("O seu nome é " +nome);
        System.out.println("Voce tem " +idade+ "anos");
        System.out.println("voce tem "+altura+ " cm de altura");
        
        if(altura >= 1.90 ){
        System.out.println("Sua altura é absurda ");
        }else if (altura >= 1.80) {
            System.out.println("Sua altura é acima da media");
        } else if (altura < 1.80 || altura >= 1.65){
            System.out.println("Sua altura é normal");
        } else if(altura < 1.65 ){
            System.out.println("Voce é muito baixo ");
        }
        
        
    }
    
}
