package exemploMetodos;

public class ExemploMetodoComRetorno {

    public static String primeiroMetodo(){
       String mensagem = "teste";
        return mensagem;
    }

    public static void main(String[] args) {
        System.out.println(primeiroMetodo());
    }
}
