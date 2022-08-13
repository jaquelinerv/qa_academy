package medium;

public class Exercicio_09_medium {

    public static void main(String[] args) {
        String nomeAlunos [] = new String[5];
        int numeroAlunos [] = new int[5];
        nomeAlunos[0] = "Jaqueline";
        nomeAlunos[1] = "José";
        nomeAlunos[2] = "Gabriela";
        nomeAlunos[3] = "João";
        nomeAlunos[4] = "Renato";

        numeroAlunos[0] = 0;
        numeroAlunos[1] = 1;
        numeroAlunos[2] = 2;
        numeroAlunos[3] = 3;
        numeroAlunos[4] = 4;

        for (int i = 0; i < nomeAlunos.length; i++) {
            System.out.println("Nome: " + nomeAlunos[i] + " | Posição no vetor: " + numeroAlunos[i]);
        }
    }
}

/*Exercício 09 - Faça um algoritmo para: Criar dois vetores.
Em um vetor: ler e  armazenar o nomes de alunos.
No outro vetor: ler e armazenar a numeração de cada aluno, de acordo com a ordem inserida
no vetor de nomes.
E exiba, o Nome e o número correspondente de cada um.*/
