package medium;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio_02_medium {
    static double valorInvestimento, taxaJuro = 0.05, totalAtualizadoComJuros;
    static int i=1, tempoInvestido=10;
    static DecimalFormat df = new DecimalFormat("##,###.##");

    public static void main(String[] args) {
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor investido"));
        totalAtualizadoComJuros = valorInvestimento;

        while (i <= tempoInvestido){
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuro) + totalAtualizadoComJuros;
            i++;
        }
        System.out.println("O valor do investimento foi de: " + df.format(valorInvestimento));
        System.out.println("O recebimento dos juros são:" + df.format(totalAtualizadoComJuros - valorInvestimento));
        System.out.println("O valor total do investimento é : " + df.format(totalAtualizadoComJuros));
    }
}
