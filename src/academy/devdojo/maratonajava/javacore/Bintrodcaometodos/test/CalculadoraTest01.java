package academy.devdojo.maratonajava.javacore.Bintrodcaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodcaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println("finalizando calculadoraTest01");
        calculadora.subtrairDoisNumeros();
    }
}
