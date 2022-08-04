package easy;

import javax.swing.*;

public class Exercicio_04_easy {
    static int numeroDigitado, resultado;

    public static void main(String[] args) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        resultado = numeroDigitado * 2;
        System.out.println("O dobro do valor digitado é: " + resultado);
    }
}
    //Inicio Algoritmo
    //Declarar variáveis do tipo inteiro: numeroDigitado, resultado;
    //numeroDigitado = Ler (6);
    //resultado = numeroDigitado * 2;
    //Exibir: “O dobro do valor digitado é:” + resultado;
    //Fim Algoritmo

    // uma classe pode ter vários métodos
    // main é um método
    // variavéis fora do método permitem usarem serem usadas outros lugares, virra global

    // a variável sempre vai ser static? tem a private tbm
    // pq tem que converter com integer.parseint?
