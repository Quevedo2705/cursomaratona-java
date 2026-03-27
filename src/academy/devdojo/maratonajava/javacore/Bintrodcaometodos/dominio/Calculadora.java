package academy.devdojo.maratonajava.javacore.Bintrodcaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }


    }

    public void imprimeDivisaoDeMetodo(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);


    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numero");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
