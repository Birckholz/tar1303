import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Digite o nome de um album: ");
        String nomeA = cs.nextLine();
        System.out.println("Digite o ano de lancamento do album");
        String anoLan = cs.nextLine();
        Album a = new Album(nomeA, anoLan);
        boolean target = true;
        int i = 0;
        while(i < 5 || target) {
            System.out.println("Digite o nome da Musica que deseja adiocinar: ");
            String nomeMus = cs.nextLine();
            Musica mus = new Musica(nomeMus);
            a.addMus(mus);
            i++;
            if (i > 5) {
                System.out.println("Deseja adionar mais uma musica se sim digite 1, se não digite 0: ");
                String resposta= cs.nextLine();
                if (resposta.equals("1")) {
                    continue;
                } else {
                    target = false;
                }
            }
        }
    }
}