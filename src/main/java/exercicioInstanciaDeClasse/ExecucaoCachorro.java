package exercicioInstanciaDeClasse;

public class ExecucaoCachorro {
    public static void main(String[] args) {
        Cachorro objetoCachorro = new Cachorro();

        System.out.println(objetoCachorro.idadeCachorro);
        System.out.println(objetoCachorro.nomeCachorro);

        objetoCachorro.latir();
        objetoCachorro.pular();
        System.out.println(objetoCachorro.idadeCachorro(7));
    }
}
