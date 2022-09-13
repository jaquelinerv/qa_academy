package medium;

public class Exercicio_01_medium {
    public static void imparOuPar(){
        int i = 0;
        while (i <= 100){
            if (i % 2  == 0){
                System.out.println("O número " + i + " é par");
            } else {
                System.out.println("O número " + i + " é ímpar");
            }
            i++;
        }
    }
}
// % = exibe o resto da divisão

/* static int i = 0;

    public static void main(String[] args) {
        while (i <= 100){
            if (i % 2  == 0){
                System.out.println("O número " + i + " é par");
            } else {
                System.out.println("O número " + i + " é ímpar");
            }
            i++;
        }
    }*/