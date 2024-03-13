import java.util.ArrayList;

public class Album {
    private String  nome;
    private String  anoLan;
    private ArrayList<Musica> listMus;

    public Album(String nome, String anoLan) {
        this.nome = nome;
        this.anoLan = anoLan;
        listMus = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getAnoLan() {
        return anoLan;
    }

    public void addMus(Musica mus) {
        this.listMus.add(mus);
    }
}
