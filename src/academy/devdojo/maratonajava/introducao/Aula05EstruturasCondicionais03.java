package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
    double salario = 6000 ;
    String MensagemNaoDoar = "Eu nao vou doar ao dev dojo";
    String MensagemDoar = "Eu vou doar ao dev dojo";
    String resultado;
    if (salario > 5000){
        resultado = MensagemDoar;
    }
    else{
        resultado = MensagemNaoDoar;
    }
        System.out.println(resultado);





    }
}
