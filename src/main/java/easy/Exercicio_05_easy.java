package easy;

import javax.swing.*;

public class Exercicio_05_easy {
    public int somaResultado (int valorInformado1, int valorInformado2, int valorInformado3) {
        int soma;
        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        return  soma;
    }
    public int subResultado (int valorInformardo1, int valorInformado2, int valorInformado3){
        int subtracao;
        subtracao = (valorInformado3 - valorInformado2) - valorInformardo1;
        return subtracao;
    }
    public int multResultado(int valorInformardo1, int valorInformado2, int valorInformado3){
        int multiplicacao;
        multiplicacao = (valorInformardo1 * valorInformado2) * valorInformado3;
        return multiplicacao;
    }
    public int mediaResultado(int soma){
        int divisaoMedia;
        divisaoMedia = soma / 3;
        return divisaoMedia;
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
