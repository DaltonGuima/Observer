package pacote;

public class Aluno extends Pessoa implements Assinante {
    public void lerNoticia(String noticia, String nomeJornal) {
        System.out.println("\nAssinante: " + getNome() + "\nRevista: " + nomeJornal + "\nNotícia: " + noticia);
    }
}
