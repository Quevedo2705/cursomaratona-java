package academy.devdojo.maratonajava.javacore.Aintrodcaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintrodcaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "vinicus";
        professor.sexo = 'M';
        professor.idade = 23;
        System.out.println("Nome :" + professor.nome + " idade:" + professor.idade + " sexo:" + professor.sexo);
    }
}
