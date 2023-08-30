package pacote;

import java.util.ArrayList;
import java.util.List;

public class Revista implements Publicador{
    private String nome;
    private List<Assinante> assinantes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAssinante(Assinante a){
        assinantes.add(a);
    };
    public void removerAssinante(Assinante a){
        assinantes.remove(a);
    };
    public void publicar(String a){
        for (Assinante assinante : assinantes) {
            assinante.lerNoticia(a, nome);
        }
    };
}
