package medium;
public class Exercicio_07_08_medium {
    static int i;
    public static void main(String[] args) {
     String meses[] = new String [12];
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

        /* for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i]);
        }*/ // no for nao aparece o número do mês

        while (i < 12){
            System.out.println("O mês " + (i + 1) + " é " + meses[i]);
            i++;
        }
        /* no while aparece o número do mês correto. i inicia com 0 e toda vez que passar
         no while adiciona + 1*/
    }
}

/*Exercício 7 - Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.
Exercício 8 - Faça um algoritmo para exibir todos os meses digitados anteriormente*/
