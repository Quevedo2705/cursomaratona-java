package academy.devdojo.maratonajava.javacore.Bintrodcaometodos.test.Funcionario;

import academy.devdojo.maratonajava.javacore.Bintrodcaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "joao";
        funcionario.idade = 18;
//        funcionario.salarios = new double[] {1500, 850.32, 3000};

       funcionario.imprime();
       funcionario.ImprimeMedia();

    }
}
