package medium;
import javax.swing.*;

public class Exercicio_05_medium {
    static int numeroDigitado, i = 0, menorNumero;

    public static void main(String[] args) {
        while(i < 5){
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if (i == 0){
                menorNumero = numeroDigitado;
            }
            if (numeroDigitado < menorNumero){
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O menor número é: " + menorNumero);


    }

}
