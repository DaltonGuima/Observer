package pacote;

public class App {
    public static void main(String[] args) throws Exception {
        Jornal j1 = new Jornal();
        Aluno a1 = new Aluno();
        a1.setNome("Rafinha PVP12");
        j1.adicionarAssinante(a1);
        j1.setNome("VEJA");
        j1.publicar("Irei morer");

        Revista r1 = new Revista();
        Trabalhador t1 = new Trabalhador();
        
        t1.setNome("Capa Bravo");
        r1.adicionarAssinante(t1);
        r1.setNome("Não Veeja");
        r1.publicar("PORRA");
    }
}
