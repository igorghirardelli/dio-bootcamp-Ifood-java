/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package olamundo;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class OlaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Informe um numero");
        int num = number.nextInt();
        
        if(num%3 == 0 && num%5 ==0){
          System.out.println("FizzBuzz");
        } else if(num %3 == 0 || num %5 == 0){
          if(num %3 == 0){
            System.out.println("Fizz");
          } else {
            System.out.println("Buzz");
          }
        } else{
          System.out.println("O "+num+" Não é multiplo nem de 3 e nem de 5");
        }
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    }
    
}
