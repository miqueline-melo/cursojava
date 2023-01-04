package cursodevdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        double valorTotal=30000;
        for (int parcelas = 1; parcelas <= valorTotal ; parcelas++) {
            double valorParcelas = valorTotal/ parcelas;
            if (valorParcelas>=1000){
                System.out.println("parcela " +parcelas + " R$ " + valorParcelas);

            }else{
                break;
            }


        }

    }
}
