package medium;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Exercicio_06_medium {
    static int numeroDigitado, resultadoFatorial = 1;
    public static void main(String[] args) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        while (numeroDigitado >= 1){
            resultadoFatorial = numeroDigitado * resultadoFatorial;
            numeroDigitado--;
        }


        System.out.println("O resultado do seu fatorial é : " + resultadoFatorial);
    }

}
