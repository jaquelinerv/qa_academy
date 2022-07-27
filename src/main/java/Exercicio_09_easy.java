import javax.swing.*;

public class Exercicio_09_easy {
    static int numeroDigitado, resultado, i=1;

    public static void main(String[] args) {
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));

        while (i <= 10){
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + "x"+ i + "=" + resultado);
            i++;
        }
    }
}
