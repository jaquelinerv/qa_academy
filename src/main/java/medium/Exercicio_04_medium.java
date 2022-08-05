package medium;

public class Exercicio_04_medium {

    static int i = 1, resultadoMultiplicacao = 1;

    public static void main(String[] args) {
        while (i <= 1000){
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println(resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000){
                resultadoMultiplicacao = 1;
                System.out.println(resultadoMultiplicacao);
            }
            i++;
        }
    }
}
