import interfaces.PesoIdeal;
import model.Homem;
import model.Mulher;
import model.PessoaAdapter;

public class App {
    public static void main(String[] args) {
        PesoIdeal homem = new PessoaAdapter(new Homem("Carlos", 70.0, 1.75));
        PesoIdeal mulher = new PessoaAdapter(new Mulher("Maria", 58.0, 1.60));

        System.out.println(homem);
        System.out.println(mulher);
    }
}
