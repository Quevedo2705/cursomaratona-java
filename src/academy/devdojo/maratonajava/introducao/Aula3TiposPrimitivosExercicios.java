package academy.devdojo.maratonajava.introducao;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula3TiposPrimitivosExercicios {
    public static void main(String[] args) {
     String nome = ("joao pedro ");
     String endereco = ("rua doutor jose luciano de mello, numero 325 ");
     double salario = 1600 ;
     String data = ("10 de setembro");
     String relatorio = "eu " +nome+ " morando no endereco " +endereco+ "confirmo que recebi o salario de "+salario+", na data de " + data ;
        System.out.println(relatorio);
    }
}
