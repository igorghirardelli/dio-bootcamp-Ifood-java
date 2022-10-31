/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaanatomia.classes;

/**
 *
 * @author igora
 */
public class Metodoss {
    public static void main(String[] args) {
        String primeiroNome = "igor";
        String segundoNome = "ghirardelli";
        
        String nomeCompleto  = nomeCompleto(primeiroNome,segundoNome);
        
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método "+primeiroNome.concat(" ").concat(segundoNome);
    }
}
