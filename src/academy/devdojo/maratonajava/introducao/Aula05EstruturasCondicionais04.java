package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 73000;
        String faixaIsento = ("voce esta isento");
        double primeiraFaixa = 7.5 / 100;
        double segundaFaixa = 15.0 / 100;
        double terceiraFaixa = 22.5 / 100;
        double quartaFaixa = 27.5 / 100;

        if (salarioAnual < 60001) {
            System.out.println(faixaIsento);
        } else if (salarioAnual >= 60001 && salarioAnual <= 72000) {
            salarioAnual = salarioAnual * primeiraFaixa;
            System.out.println("Voce esta na primeira faixa " + salarioAnual);

        } else if (salarioAnual >= 72001 && salarioAnual <= 90000) {
            salarioAnual = salarioAnual * segundaFaixa;
            System.out.println("Voce esta na segunda faixa " + salarioAnual);

        } else if (salarioAnual >= 90001 && salarioAnual <= 114000) {
            salarioAnual = salarioAnual * terceiraFaixa;
            System.out.println("Voce esta na terceira faixa " + salarioAnual);

        } else {
            salarioAnual = salarioAnual * quartaFaixa;
            System.out.println("voce esta na quarta faixa " + salarioAnual);
        }
    }
}