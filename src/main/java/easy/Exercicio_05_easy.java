package easy;

import javax.swing.*;

public class Exercicio_05_easy {
    static int valorInformado1, valorInformado2, valorInformado3, soma, subtracao, multiplicacao, divisaoMedia;

    public static void main(String[] args) {

        valorInformado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        valorInformado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        valorInformado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));

        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtracao = (valorInformado3 - valorInformado2) - valorInformado1;
        multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        divisaoMedia = soma / 3;

        System.out.println("A soma dos valores: " +  soma  + "\nA subtração dos valores é: " + subtracao  +
                "\nA multiplicação dos valores é: " + multiplicacao + "\nA media dos valores é: " + divisaoMedia);
    }
}

/*Inicio do Algoritmo

        Declarar variável do tipo inteiro: valorInformado1, valorInformado2, valorInformado3; soma; subtracao, multiplicacao,
        divisaoMedia;
        valorInformado1= Ler (5);
        valorInformado2= Ler (3);
        valorInformado3= Ler (8);

        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtracao = (valorInformado3 – valorInformado2) – valorInformado1;
        multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        divisaoMedia = soma / 3;

        Exibir: “Valores: ” + soma + subtração + multiplicacao + divisaoMedia;

        ˜Valores : 16, 0, 120, 5˜

  Fim do Algoritmo
 */
