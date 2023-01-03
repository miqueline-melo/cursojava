package cursodevdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - * /
        int numero01=10;
        int numero02=20;
        double resultado= numero01+numero02;

        System.out.println( resultado );
        System.out.println(numero01+numero02);

        // %
        int resto=20%3;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQue20= 10>20;
        boolean isDezMenorQue20=10<20;
        boolean isDezIgualA20= 10==20;
        boolean isDezDiferenteDe20= 10!=20;
        System.out.println("isDezMaiorQue20 "+isDezMaiorQue20);
        System.out.println("isDezMenorQue20 "+isDezMenorQue20);
        System.out.println("isDezIgualA20 "+isDezIgualA20);
        System.out.println("isDezDiferenteDe20 "+isDezDiferenteDe20);

        // && (AND) || (OR) !

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente= 200;
        double valorTotalContaPoupanca= 10000;
        float valorPlaystationCinco= 5000f;

        boolean isPlayStationCompravel = valorTotalContaCorrente > valorPlaystationCinco || valorTotalContaPoupanca > valorPlaystationCinco;

        System.out.println("playStationCompravel " + isPlayStationCompravel);

        //= += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2=0;
        System.out.println(contador2++);
        System.out.println(++contador2);


    }
}
