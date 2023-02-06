package Metodos;
public class Main {
    public static void main(String[] args) {
        
        int n = 1;
    
    
    while(n <= 100) {
        
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + "FizzBuzz");
        } else if(n % 5 ==0){
            System.out.println(n + "Buzz");
        }else if(n % 3 == 0){
            System.out.println(n + "Fizz");
    }
    n++;
        
 }

}
}
