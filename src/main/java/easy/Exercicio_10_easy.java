package easy;

import javax.swing.*;

public class Exercicio_10_easy {
    public double calculaJuros(double valorInvestimento){
        int ano = 1;
        double taxaJuros = 0.05, valorJuros = 0;

        while (ano <=10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;
        }
        return valorJuros;
    }
    public double totalComJuros(double valorJuros, double valorInvestimento){
        double valorTotal = valorJuros + valorInvestimento;
        return valorTotal;
    }

}

/*   static double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
    static int ano = 10;

    public static void main(String[] args) {
       valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite seu investimento:"));
       valorJuros = (ano * taxaJuros) * valorInvestimento;
       valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor investimento: R$" + valorInvestimento);
        System.out.println("Valor juros: R$" + valorJuros);
        System.out.println("Valor total com Juros: R$" + valorTotal);
    }*/
