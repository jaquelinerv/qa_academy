package exemploMetodos;

public class exerciciosMetodosComParametros {
    public static void main(String[] args) {
        //5 Metodos com retorno
        System.out.println(exibirNomeEIdade(29, "Emerson"));

        //5 Metodos sem retorno
        exibirNomeEIdadeSemRetorno(29, "Emerson");
    }

    //5 metodos com retorno
    public static String exibirNomeEIdade(int idade, String nome){
        return "Nome: " + nome + " Idade: " + idade;
    }

    //5 metodos sem retorno
    public static void exibirNomeEIdadeSemRetorno(int idade, String nome){
        System.out.println("Nome: " + nome + " Idade: " + idade);
    }
}
