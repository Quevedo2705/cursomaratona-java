package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main (String[] args) {
        // +

        int numero= (5);
        int numero2 = (5);
        int resultado = numero + numero2;
        System.out.println(resultado);

        // -

        int numerosub = (16);
        int numerosub2 = (6);
        int resultadosub = (numerosub - numerosub2);
        System.out.println(resultadosub);

        // /

        int numerodiv = (100);
        int numerodiv2 = (10);
        int resultadodiv = numerodiv / numerodiv2;
        System.out.println(resultadodiv);

        // %

        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte  = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualQueVinte);
        System.out.println("isDezIgualDez "+ isDezIgualDez);
        System.out.println("isDezDiferenteDez "+ isDezDiferenteDez);

        // && (AND)  || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaleiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaleiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorqueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorTotalGuardado = valorTotalContaCorrente + valorTotalContaPoupanca;
        float valorPlaystation = 5800;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel  " + isPlaystationCincoCompravel + " Valor do playstation: " + valorPlaystation + " saldo da conta corrente: " + valorTotalContaCorrente + " saldo da conta poupanca " + valorTotalContaPoupanca  + " total guardado e " + valorTotalGuardado);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++(adiciona 1 a variavel) --(subtrai 1 da variavel)
        int contador =0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 =0;
        System.out.println(contador2);
        System.out.println(contador2);
    }
}


