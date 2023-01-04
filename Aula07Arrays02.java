package cursodevdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double => 0
        //char => '\u0000' '
        //boolean => false
        //String => null
        String[] nomes= new String[3];
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);


        String [] frutas= new String[3];
        frutas [0] = "maça";
        frutas [1] = "banana";
        frutas [2] = "manga";

        for (int i = 0; i < 3; i++) {
            System.out.println(frutas[i]);

        }

    }
}
