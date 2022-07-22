import javax.swing.*;

public class Exercicio_07_easy {
    static double salario, inss;

    public static void main(String[] args) {
    salario = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salário:"));


    if (salario <= 1045.00) {
        inss = salario * 0.75;
    }
        System.out.println("O valor a ser pago de INSS é " + inss);
    }
}



