/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.smart.tvv;

/**
 *
 * @author igora
 */
public class SistemaSmartTvv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
         smartTv.diminuirVolume(); 
         smartTv.diminuirVolume();
         smartTv.diminuirVolume(); 
         smartTv.aumentarVolume(); 
         
         smartTv.mudarCanal(13);
         System.out.println("Canala atual: "+smartTv.canal);
            
        System.out.println("ligada? "+smartTv.ligada);
        System.out.println("Qual canal? "+smartTv.canal);
        System.out.println("Qual volume? "+smartTv.volume);
       
         
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? "+smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? "+smartTv.ligada);
        
        
        
        
        
        
    }
    
}
