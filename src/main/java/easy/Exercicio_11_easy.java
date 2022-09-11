package easy;

import javax.swing.*;

public class Exercicio_11_easy {
    public int somaAlgoritmo(int numeroDigitado){
        int i = 1;

        while (i <= 100) {

            numeroDigitado = numeroDigitado + 2;
            System.out.println(numeroDigitado);
            i++;
        }
        return numeroDigitado;
    }

}

/* static int numeroDigitado, i = 1;
    public static void main(String[] args) {

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));

        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            System.out.println(numeroDigitado);
            i++;
            //teste
        }
    }*/