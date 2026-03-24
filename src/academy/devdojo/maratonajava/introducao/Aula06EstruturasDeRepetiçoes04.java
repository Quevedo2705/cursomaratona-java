package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetiçoes04 {
    //dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
    //Condiçao valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
