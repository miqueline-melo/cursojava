package cursodevdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {


        double valorTotal = 30000;
        for (int parcelas = (int) valorTotal; parcelas>=1; parcelas--) {
            double valorParcelas = valorTotal / parcelas;
            if (valorParcelas > 1000) {
                continue;
            }
            System.out.println("parcelas" + parcelas+ "R$" + valorParcelas);
        }
    }
}
