package easy;

import javax.swing.*;

public class Exercicio_10_easy {
    static double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
    static int ano = 10;

    public static void main(String[] args) {
       valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite seu investimento:"));
       valorJuros = (ano * taxaJuros) * valorInvestimento;
       valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor investimento: R$" + valorInvestimento);
        System.out.println("Valor juros: R$" + valorJuros);
        System.out.println("Valor total com Juros: R$" + valorTotal);
    }
}
