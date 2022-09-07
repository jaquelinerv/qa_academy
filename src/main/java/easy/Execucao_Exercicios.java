package easy;

import javax.swing.*;

public class Execucao_Exercicios {

    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercício a ser executado: "));

        //exe02
        if (selecionaExercicio == 2) {
            Exercicio_02_easy ex02 = new Exercicio_02_easy();
            String palavraDigitada = ex02.retornarPalavra(JOptionPane.showInputDialog("Digite uma palavra: "));
            System.out.println(palavraDigitada);
        }

        //exe04
        if (selecionaExercicio == 4) {
            Exercicio_04_easy ex04 = new Exercicio_04_easy();
            int numeroDigitado = 12;
            System.out.println("O dobro de " + numeroDigitado + " é: " + ex04.retornadobroNumero(numeroDigitado));
        }
        //exe05
        if (selecionaExercicio == 5){
            Exercicio_05_easy ex05 = new Exercicio_05_easy();
            int soma = ex05.somaResultado(1,2,3);
            int subt = ex05.subResultado(1,2,3);
            int mult = ex05.multResultado(1,2,3);
            int media = ex05.mediaResultado(soma);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Subtracao dos valores: " + subt);
            System.out.println("Multplicacao dos valores: " + mult);
            System.out.println("Media dos valores: "+ media);
        }
    }


}
