public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    //metodos que manipulam esses estados

    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
        //volume = volume +1        
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
        //volume = volume -1        
    }

    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }
}