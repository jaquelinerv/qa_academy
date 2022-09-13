package medium;

import javax.swing.*;

public class Execucao_exercicios_medium {
    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercício a ser executado: "));

        //exe01
        if (selecionaExercicio == 1){
            Exercicio_01_medium exe01m = new Exercicio_01_medium();
            exe01m.imparOuPar();
        }
        //exe02
        if (selecionaExercicio == 2){

        }
    }
}
