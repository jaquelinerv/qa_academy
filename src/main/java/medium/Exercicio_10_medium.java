package medium;

public class Exercicio_10_medium {
//    static int ini = 0, sec = 1, acc = 0, aux =0; test
    public static void main(String[] args) {
        int[] fibonacci = new int[9];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < 9; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i -2];
            System.out.println(fibonacci[i]);
        }
    }

}

/*Exercício 10 - Faça um algoritmo que calcule e exiba a sequencia de Fibonacci
até o 10o elemento.
Ex.: 0, 1,1 .. 34. Usando Vetor, para armazenar o resultado.
A sequencia de Fibonacci, é calculada com a soma dos 2 termos anteriores, sendo o
primeiro e o segundo 0 e 1, respectivamente. 0, 1, 1, 2, 3, 5, 8, 13 .. 21.*/
