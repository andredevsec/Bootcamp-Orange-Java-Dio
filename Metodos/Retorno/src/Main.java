public class Main {
    public static void main(String[] args) {
        System.out.println("Retornos do exercicio");

        double areaQuadrado = Quadrilatero.area(1);
        System.out.println("area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(2, 2);
        System.out.println("area do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(1, 2, 3);
        System.out.println("area do trapezio: " + areaTrapezio);
    }
    
}
