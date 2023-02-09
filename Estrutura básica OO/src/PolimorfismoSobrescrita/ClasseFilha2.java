package PolimorfismoSobrescrita;

public class ClasseFilha2 extends ClasseMae{
    
    @Override //Palavra ingles para sobreescrever
    void metodo1(){
        System.out.println("Metodo 1 da classe filha 2");
    }
  
    @Override
    void metodo2(){
        System.out.println("Metodo 1 da classe filha 1");
    }
    
}
