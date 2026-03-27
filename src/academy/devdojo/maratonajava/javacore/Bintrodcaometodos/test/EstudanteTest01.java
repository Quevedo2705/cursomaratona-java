package academy.devdojo.maratonajava.javacore.Bintrodcaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodcaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintrodcaometodos.dominio.Impressora;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Impressora impressora = new Impressora();

        estudante01.nome = "Joao";
        estudante01.idade = 19;
        estudante01.sexo = 'm';


        estudante02.nome = "Maria";
        estudante02.idade = 20;
        estudante02.sexo = 'f';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("-------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        impressora.imprime(estudante01);


        impressora.imprime(estudante02);


    }
}
