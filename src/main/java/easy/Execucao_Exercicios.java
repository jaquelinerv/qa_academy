package easy;

import javax.swing.*;
import java.text.DecimalFormat;

public class Execucao_Exercicios {

    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercício a ser executado: "));

        //exe02
        if (selecionaExercicio == 2) {
            Exercicio_02_easy ex02 = new Exercicio_02_easy();
            String palavraDigitada = ex02.retornarPalavra(JOptionPane.showInputDialog("Digite uma palavra: "));
            System.out.println(palavraDigitada);
        }
        //ex03
        if (selecionaExercicio == 3){
            Exercicio_03_easy ex03_easy = new Exercicio_03_easy();
            String primeiroNome = "Farofa";
            String segundoNome = "Arroz";
            System.out.println(ex03_easy.retornaValorTroca(primeiroNome, segundoNome));
        }
        //exe04
        if (selecionaExercicio == 4) {
            Exercicio_04_easy ex04 = new Exercicio_04_easy();
            int numeroDigitado = 12;
            System.out.println("O dobro de " + numeroDigitado + " é: " + ex04.retornadobroNumero(numeroDigitado));
        }
        //exe05
        if (selecionaExercicio == 5){
            Exercicio_05_easy ex05 = new Exercicio_05_easy();
            int soma = ex05.somaResultado(1,2,3);
            int subt = ex05.subResultado(1,2,3);
            int mult = ex05.multResultado(1,2,3);
            int media = ex05.mediaResultado(soma);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Subtracao dos valores: " + subt);
            System.out.println("Multplicacao dos valores: " + mult);
            System.out.println("Media dos valores: "+ media);
        }
        //exe06
        if (selecionaExercicio == 6){
            Exercicio_06_easy ex06 = new Exercicio_06_easy();
            double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
            double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
            System.out.println(ex06.verificaAprovacao(primeiraNota,segundaNota));
        }
        //exe07
        if (selecionaExercicio == 7){
            Exercicio_07_easy ex07 = new Exercicio_07_easy();
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));
            System.out.println(ex07.retornaValorInss(salario));
        }
        //exe08
        if (selecionaExercicio == 8){
            Exercicio_08_easy ex08_easy = new Exercicio_08_easy();
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
            double impostoDeRenda = ex08_easy.calculaImpostoRenda(salario);
            System.out.println("O imposto de renda sera: " + ex08_easy.calculaImpostoRenda(salario));
            System.out.println("O salario liquido sera: " + ex08_easy.calculaSalarioLiquido(salario, impostoDeRenda));
        }
        //exe09
        if (selecionaExercicio == 9 ){
            Exercicio_09_easy ex09 = new Exercicio_09_easy();
            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 1 a 10: "));
            ex09.calculaTaboada(numeroDigitado);
        }

        //exe10
        if (selecionaExercicio == 10){
            double valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor investido: "));
            DecimalFormat df = new DecimalFormat("#,###.##");

            Exercicio_10_easy ex10_easy = new Exercicio_10_easy();
            double valorJuros = ex10_easy.calculaJuros(valorInvestimento);
            String valorTotal = df.format(ex10_easy.totalComJuros(valorJuros, valorInvestimento));
            System.out.println("Valor investido: R$" + valorInvestimento + "\n" + "Valor juros: " + df.format(valorJuros));
            System.out.println("Valor total com juros: R$" + valorTotal);
        }

        //exe11
        if (selecionaExercicio == 11){
            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            Exercicio_11_easy ex11_easy = new Exercicio_11_easy();
            System.out.println("O total somado é: " + ex11_easy.somaAlgoritmo(numeroDigitado));
        }
        else if(selecionaExercicio > 11) {
            System.out.println("Esse exercicio ainda não existe");
        }

    }
}
