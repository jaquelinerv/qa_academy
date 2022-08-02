import javax.swing.*;

public class Exercicio_11_easy {
    static int numeroDigitado, i = 1;
    public static void main(String[] args) {

        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));

        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            System.out.println(numeroDigitado);
            i++;
            //teste
        }
    }
}