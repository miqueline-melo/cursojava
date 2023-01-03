package cursodevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 4;
        //char, int, byte, short, enum, string
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opcao invalida");

        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("homem");
                break;
            case 'F':
                System.out.println("mulher");
                break;
            default:
                System.out.println("opcao invalida");
                break;
        }
    }
}
