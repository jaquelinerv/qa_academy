package refatoracao_easy;
import javax.swing.*;

public class Exercicios_easy_refactor {
    public static void exercicio_02_easy() {
        String palavraDigitada;
        palavraDigitada = JOptionPane.showInputDialog("Digite uma palavra:");
        System.out.println("O usuario digitou: " + palavraDigitada);
    }

    public static void exercicio_03_easy() {
        int primeiroValor, segundoValor;
        primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        System.out.println("Primeiro valor digitado: " + segundoValor);
        System.out.println("Segundo valor digitado: " + primeiroValor);
    }

    public static void exercicio_04_easy() {
        int numeroDigitado, resultado; // pq aqui nao pode ser static int? a IDE reclama.
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        resultado = numeroDigitado * 2;
        System.out.println("O dobro do valor digitado é: " + resultado);
    }

    public static void exercicio_05_easy() {
        int valorInformado1, valorInformado2, valorInformado3, soma, subtracao, multiplicacao, divisaoMedia;
        valorInformado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        valorInformado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        valorInformado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));

        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtracao = (valorInformado3 - valorInformado2) - valorInformado1;
        multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        divisaoMedia = soma / 3;

        System.out.println("A soma dos valores: " + soma + "\nA subtração dos valores é: " + subtracao +
                "\nA multiplicação dos valores é: " + multiplicacao + "\nA media dos valores é: " + divisaoMedia);
    }
}
/*
    public static void exercicio_06_easy() {
        double primeiraNota, segundaNota, mediaNotas;
        primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Sua primeira nota é:"));
        segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Sua segunda nota é: "));
        mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas > 5) {
            System.out.println("Aprovado!! :)");
        }
        if (mediaNotas < 5) {
            System.out.println("Reprovado kkk");
        } else if (mediaNotas == 5) {
            System.out.println("Ficou pra exame, bobo :P");
        }
        }
        public static void exercicio_07_easy () {
            double salario, inss;
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
        }

        public static void exercicio_08_easy() {
           double salario, salarioLiquido, impostoRenda;
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));
            if (salario >= 0 && salario <= 1903.98) {
                impostoRenda = 0;
                salarioLiquido = salario - impostoRenda;
            }
            if (salario >= 1903.99 && salario <= 2826.65) {
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
            } else if (salario >= 4664.69) {
                impostoRenda = (salario * 0.275) - 869.36;
                salarioLiquido = salario - impostoRenda;
            }
            System.out.println("Seu salario bruto sera: R$" + salario);
            System.out.println("Seu salario líquido sera: R$ " + salarioLiquido);
            System.out.println("O valor a ser pago de IR sera: R$" + impostoRenda);
        }



        public static void exercicio_09_easy () {
            int numeroDigitado, resultado, i = 1;
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));

            while (i <= 10) {
                resultado = numeroDigitado * i;
                System.out.println(numeroDigitado + "x" + i + "=" + resultado);
                i++;
            }
            public static void exercicio_10_easy(){
                double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
                int ano = 10;
                valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite seu investimento:"));
                valorJuros = (ano * taxaJuros) * valorInvestimento;
                valorTotal = valorJuros + valorInvestimento;
                System.out.println("Valor investimento: R$" + valorInvestimento);
                System.out.println("Valor juros: R$" + valorJuros);
                System.out.println("Valor total com Juros: R$" + valorTotal);

            }
            public static void exercicio_11_easy(){
                int numeroDigitado, i = 1;
                numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));
                while (i <= 100) {
                    numeroDigitado = numeroDigitado + 2;
                    System.out.println(numeroDigitado);
                    i++;
                    //teste
                }
            }
        }
    }
    */






