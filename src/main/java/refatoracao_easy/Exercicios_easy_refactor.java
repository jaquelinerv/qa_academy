package refatoracao_easy;
import javax.swing.*;

public class Exercicios_easy_refactor {
    public static void exercicio_02_easy() {
        String palavraDigitada = "Jaqueline";
        System.out.println("\nExercício 02" + " \n O usuario digitou: " + palavraDigitada);
    }

    public static void exercicio_03_easy() {
        int primeiroValor = 10, segundoValor = 20;
        System.out.println("\nExercício 03" + "\n Primeiro valor digitado: " + segundoValor);
        System.out.println(" Segundo valor digitado: " + primeiroValor);
    }

    public static void exercicio_04_easy() {
        int numeroDigitado = 10, resultado; // pq aqui nao pode ser static int? a IDE reclama. pq ja tem static no método
        resultado = numeroDigitado * 2;
        System.out.println("\nExercício 04" + "\n O dobro do valor digitado é: " + resultado);
    }

    public static void exercicio_05_easy() {
        int valorInformado1 = 10, valorInformado2 = 20, valorInformado3 = 30, soma, subtracao, multiplicacao, divisaoMedia;
        soma = valorInformado1 + (valorInformado2 + valorInformado3);
        subtracao = (valorInformado3 - valorInformado2) - valorInformado1;
        multiplicacao = (valorInformado1 * valorInformado2) * valorInformado3;
        divisaoMedia = soma / 3;

        System.out.println("\nExercício 05" + "\n A soma dos valores: " + soma + "\n A subtração dos valores é: " + subtracao +
                "\n A multiplicação dos valores é: " + multiplicacao + "\n A media dos valores é: " + divisaoMedia);
    }

    public static void exercicio_06_easy() {
        double primeiraNota = 10, segundaNota = 5, mediaNotas;
        mediaNotas = (primeiraNota + segundaNota) / 2;
        if (mediaNotas > 5) {
            System.out.println("\nExercício 06" + "\n Aprovado!! :)");
        }
        if (mediaNotas < 5) {
            System.out.println("Reprovado kkk");
        } else if (mediaNotas == 5) {
            System.out.println("Ficou pra exame, bobo :P");
        }
    }

    public static void exercicio_07_easy() {
        double salario = 4800, inss;
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
        System.out.println("\nExercício 07" + "\n O valor a ser pago de INSS é " + inss);
    }
    public void exercicio_08_easy() {
        double salario = 1000, salarioLiquido = 0, impostoRenda = 0; // pq eu tive que iniciar essas variáveis com 0 aqui??
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
        System.out.println("\nExercicio 08" + "\n Seu salario bruto sera: R$" + salario);
        System.out.println(" Seu salario líquido sera: R$ " + salarioLiquido);
        System.out.println(" O valor a ser pago de IR sera: R$" + impostoRenda);
    }
        public static void exercicio_09_easy () {
            int numeroDigitado = 10, resultado, i = 1;
            System.out.println("\nExercicio 09");
            while (i <= 10) {
                resultado = numeroDigitado * i;
                System.out.println(" " + numeroDigitado + "x" + i + "=" + resultado);
                i++;
            }
        }
            public static void exercicio_10_easy () {
                double valorJuros, taxaJuros = 0.05, valorInvestimento = 1000, valorTotal;
                int ano = 10;
                valorJuros = (ano * taxaJuros) * valorInvestimento;
                valorTotal = valorJuros + valorInvestimento;
                System.out.println("\nExercicio 10\n" + " Valor investimento: R$" + valorInvestimento);
                System.out.println(" Valor juros: R$" + valorJuros);
                System.out.println(" Valor total com Juros: R$" + valorTotal);

            }
            public static void exercicio_11_easy(){
                int numeroDigitado = 5, i = 1;
                System.out.println("\nExercicio 11");
                while (i <= 5) {
                    numeroDigitado = numeroDigitado + 2;
                    System.out.println(" O número digitado (5) + 2 por cinco vezes é " + numeroDigitado);
                    i++;
                    //teste
                }
            }
        }








