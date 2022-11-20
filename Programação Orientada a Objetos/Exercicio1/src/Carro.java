public class Carro {
    String cor;
    String modelo;
    double Tanque;


    Carro(){

    }

    Carro(String cor, String modelo, double tanque){
        this.cor = cor;
        this.modelo  = modelo;
        this.Tanque = tanque;
    }



    void setCor(String cor){
       this.cor = cor;
   }

   String getCor(){
       return cor;
   }

    void setModelo(String modelo){
       this.modelo = modelo;
    }

    String getModelo(){
       return modelo;
    }


    void setTanque(double Tanque){
       this.Tanque = Tanque;
    }

    double getTanque(){
        return Tanque;
    }



    double totalValorTanque(double valorCombustivel) {
        return Tanque * valorCombustivel;
    }




}
