/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author igora
 */
public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha
        /* Olá,
        * Eu sou um comentario
        * que posso ser mais detalhadod
        * quando necessário
        */
        
       /* oi,
       *eu sou uma comentarios
       *teste
       */
      
       
       
    }
 /*
  Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números  
 */
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}




}
