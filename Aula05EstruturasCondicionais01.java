package cursodevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int  idade = 15;
        boolean isAutorizadoComprarBebidaAlcolica = idade>=18;

        //!
        if (isAutorizadoComprarBebidaAlcolica) {
            System.out.println("Autorizado Comprar Bebida Alcolica");
        }
        if (!isAutorizadoComprarBebidaAlcolica){
            System.out.println("Nao Autorizado Comprar Bebida Alcolica");
        }
        int valorTotalConta = 500;
        boolean consigoComprarCarro = valorTotalConta>=10000;

        if (consigoComprarCarro){
            System.out.println("Parabens vc vai conseguir comprar o carro");
            }else{
            System.out.println("infelizmente vc nao vai consegui compara o carro");

        }
    }
}