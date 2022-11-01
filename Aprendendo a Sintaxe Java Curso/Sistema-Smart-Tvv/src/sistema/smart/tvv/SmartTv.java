/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.smart.tvv;

/**
 *
 * @author igora
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        
    }
    
    public void aumentarCanal(){
        canal++;
        
    }
        
    public void diminuirCanal(){
        canal--;
        
    }
    
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: "+volume);
        volume--;
    }
    
    
    
    
}
