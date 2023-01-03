package cursodevdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        int idade= 18;
        String categoria;

        if (idade<15){
            categoria = "categoria infantil";
        }else if(idade >= 15 && idade<18){
            categoria = "categoria juvenio";
        }
        else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
