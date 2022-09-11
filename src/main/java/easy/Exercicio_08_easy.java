package easy;

import javax.swing.*;

public class Exercicio_08_easy {
    public double calculaImpostoRenda(double salario){
        double impostoRenda = 0;
        if (salario <= 1903.98){
            impostoRenda = 0;
        }
        if (salario >= 1903.99 && salario <= 2826.65){
            impostoRenda = (salario * 0.075) - 142.80;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoRenda = (salario * 0.15) - 636.13;

        } else if (salario >= 4664.69){
            impostoRenda = (salario * 0.275) - 869.36;
        }
        return impostoRenda;
    }

    public double calculaSalarioLiquido(double salario, double impostoRenda){
        return salario - impostoRenda;
    }
}

/*static double salario, salarioLiquido, impostoRenda;

    public static void main(String[] args) {
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));

        if (salario >= 0 && salario <= 1903.98){
            impostoRenda = 0;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 1903.99 && salario <= 2826.65){
            impostoRenda = (salario * 0.075) - 142.80;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
            salarioLiquido = salario - impostoRenda;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoRenda = (salario * 0.15) - 636.13;
            salarioLiquido = salario - impostoRenda;
        } else if (salario >= 4664.69){
            impostoRenda = (salario * 0.275) - 869.36;
            salarioLiquido = salario - impostoRenda;
        }
        System.out.println("Seu salario bruto sera: R$" + salario);
        System.out.println("Seu salario líquido sera: R$ " + salarioLiquido);
        System.out.println("O valor a ser pago de IR sera: R$" + impostoRenda);
    }*/
