package exercicioInstanciaDeClasse;

public class Cachorro {
    String nomeCachorro = "pitoco";
    int idadeCachorro = 7;

    public void latir(){
        System.out.println("AUAU!!");
    }

    public void pular(){
        System.out.println("5 metros");
    }

    public int idadeCachorro(int idade){
        return idade;
    }
}
