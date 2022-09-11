package easy;

import javax.swing.*;

public class Exercicio_07_easy {

    public String retornaValorInss(double salario){
        double inss;
        if (salario <= 1045.00) {
            inss = salario * 0.075;
        } else if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;
        } else if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;
        } else if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
        } else {
            inss = salario * 0.14;
        }
        return("O valor a ser pago de INSS é " + inss);
    }



   /* static double salario, inss;

    public static void main(String[] args) {
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));

        if (salario <= 1045.00) {
            inss = salario * 0.075;
        } else if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;
        } else if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;
        } else if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14;
        } else {
            inss = salario * 0.14;
        }
        System.out.println("O valor a ser pago de INSS é " + inss);
    }*/
}