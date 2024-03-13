import java.util.ArrayList;

public class Album {
    private String  nome;
    private String  anoLan;
    private ArrayList<String> listMus;

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

    public void addMus(String nomeMus) {
        this.listMus.add(nomeMus);
    }
}
