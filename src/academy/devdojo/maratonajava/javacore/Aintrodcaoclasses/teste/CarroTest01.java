package academy.devdojo.maratonajava.javacore.Aintrodcaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintrodcaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();


        carro01.nome = "Corsa";
        carro01.ano = 2017;
        carro01.modelo = "wind";


        carro02.nome = "jetta";
        carro02.ano = 2021;
        carro02.modelo = "high line";
        

        System.out.println("Nome:" + carro01.nome + " Ano:" + carro01.ano + " modelo:" + carro01.modelo);
        System.out.println("Nome:" + carro02.nome + " Ano:" + carro02.ano + " modelo:" + carro02.modelo);

    }


}
