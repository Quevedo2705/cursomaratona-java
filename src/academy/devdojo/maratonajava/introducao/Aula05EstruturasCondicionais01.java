package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
      //sempre sera um valor booleano
      //so sera executado se for true
      int idade = 15;
      boolean isAutorizadoComprarBebida = idade >=18;


      if(isAutorizadoComprarBebida){
          System.out.println("pode comprar bebidas");
      }else{
          System.out.println("nao pode comprar bebidas");
      }



    }
}
