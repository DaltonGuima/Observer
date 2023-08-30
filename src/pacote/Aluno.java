package pacote;

public class Aluno implements Assinante {
    private String nome;


    public String getNome() {
        return nome;
    }
      
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void lerNoticia(String noticia, String nomeJornal){
        System.out.println("\nAssinante: "+ nome + "\nRevista: "+ nomeJornal +"\nNotícia: " + noticia);
    }
}
