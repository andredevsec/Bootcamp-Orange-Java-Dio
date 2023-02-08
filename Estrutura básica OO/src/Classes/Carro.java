package Classes;


public class Carro {
    //Atributos
    int portas; 
    String cor;
    String modelo;
    int tanque; 

    //Construtor Sobrecarga de construtor, um sem lista de parametros outro com lista de parametros;
    Carro(){

    }

    Carro(int portas, String cor, String modelo, int tanque){
        this.cor = cor;
        this.modelo = modelo;
        this.portas = portas;
        this.tanque = tanque;
    }
    
    //Metodos set = pegar valor get = devolver valor-
    void setCor(String car) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setPortas(int portas) {
        this.portas = portas;
    }

    int getPortas() {
        return portas;
    }

    void setTanque(int tanque) {
        this.tanque = tanque;
    }

    int getTanque() {
        return tanque;
    }

    double totalValorTanque(double combustivel) {
        return tanque * combustivel;

    }

}
