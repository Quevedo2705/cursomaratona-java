package academy.devdojo.maratonajava.javacore.Aintrodcaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintrodcaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "joao";
        estudante.idade = 18;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
