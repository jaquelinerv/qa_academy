package medium;
import javax.swing.*;
import java.sql.SQLOutput;

public class Exercicio_09_medium {
    static int i = 0;
    public static void main(String[] args) {
        String [] nomeAlunos = new String[5];
        int [] numeroAlunos = new int[5];

        while(i < 5) {
            nomeAlunos[i] = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            numeroAlunos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do aluno: "));
            i++;
        }
        i = 0;
        while(i < 5){
            System.out.println("Nome: " + nomeAlunos[i] + " | Posição no vetor: " + numeroAlunos[i]);
            i++;
        }

    }
}

/*Exercício 09 - Faça um algoritmo para: Criar dois vetores.
Em um vetor: ler e  armazenar o nomes de alunos.
No outro vetor: ler e armazenar a numeração de cada aluno, de acordo com a ordem inserida
no vetor de nomes.
E exiba, o Nome e o número correspondente de cada um.*/
