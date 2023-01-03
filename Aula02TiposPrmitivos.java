package cursodevdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula02TiposPrmitivos {
    public static void main(String[] args){
        //int, double, float, char, byte, short, boolean, long,
        int idade = 10;
        int idad = (int) 10000000000l;
        long numeroGrande = 100000;
        double salarioDouble = 25.000;
        float salarioFloat = 26.000F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'A';
        String nome = "miqueline";

        System.out.println("a idade e "+ idade + " anos");
        System.out.println("Olá, meu nome é "+ nome);
        System.out.println(falso);
        System.out.println("char "  + caracter);


    }
}
