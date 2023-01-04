package cursodevdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numero= new int[3];
        int[] numero2= {1,2,3,4};
        int[] numero3= new int[]{1,2,3,1,2,};

        for (int i = 0; i < numero2.length; i++) {
            System.out.println(numero2[i]);
        }

        for (int num:numero){
            System.out.println(num);
        }



    }
}
