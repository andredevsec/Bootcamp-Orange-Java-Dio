package Classes;

public class Main {
    public static void main(String[] args) {
        //usando construtor vazio
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Mustang");
        carro1.setPortas(2);
        carro1.setTanque(40);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getPortas());
        System.out.println(carro1.getTanque());
        System.out.println(carro1.totalValorTanque(5.0));

        //usando contrutor com parametros
        Carro carro2 = new Carro(2,"Preto", "Gallardo", 25);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getPortas());
        System.out.println(carro1.getTanque());
        System.out.println(carro1.totalValorTanque(5.0));
    }
}
