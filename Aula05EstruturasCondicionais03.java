package cursodevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
    // doar de salario > 5000
    double salario = 3000;
    String mensagemDoar = "Eu vou doar 500 pro devdojo";
    String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
    String resultado;

    if (salario>5000){
        resultado = mensagemDoar;
        } else {
        resultado = mensagemNaoDoar;
    }
        System.out.println(resultado);
    }

    //operadores ternarios
    //(condicao) ? verdadeiro : falso;

    double salario = 3000;
    String mensagemDoar = "Eu vou doar 500 pro devdojo";
    String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
    String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


    }
