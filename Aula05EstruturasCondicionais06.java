package cursodevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        int dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opcao invalida");
                break;

        }
    }
}
