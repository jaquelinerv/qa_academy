import javax.swing.*;

public class Exercicio_06_easy {
    static double primeiraNota, segundaNota, mediaNotas;
    public static void main(String[] args) {
        primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Sua primeira nota é:"));
        segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Sua segunda nota é: "));
        mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas > 5) {
            System.out.println("Aprovado!! :)");
        }
        if (mediaNotas < 5) {
            System.out.println("Reprovado kkk");
        }
        else if (mediaNotas == 5) {
            System.out.println("Ficou pra exame, bobo :P");
        }
    }
}


/*Inicio do algoritmo

        Declarar variável do tipo inteiro: primeiraNota, segundaNota, mediaNotas;
        primeiraNota = Ler(4);
        segundaNota = Ler(5);
        mediaNotas = (primeiraNota+segundaNota) / 2;

        SE (mediaNotas > 5)
        Ler: "Aprovado!";
        FIM SE

        SE (mediaNotas < 5)
        Ler: "Reprovado!";
        FIM SE

        SE NÃO (mediaNotas = 5)
        Ler: "Ficou para exame!";

Fim do algoritmo*/
