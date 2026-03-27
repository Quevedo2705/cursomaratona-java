
import academy.devdojo.maratonajava.javacore.Bintrodcaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintrodcaometodos.dominio.Impressora;


public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        Impressora impressora = new Impressora();

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);

        System.out.println("--------------------");

        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);

        impressora.imprime(estudante);
        impressora.imprime(estudante2);

    }
}
