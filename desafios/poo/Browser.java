package desafios.poo;

public class Browser extends Application {

    public Browser() {
        super("Browser");
    }

    public void AdicionarAba() {
        System.out.println("Adicionando aba");
    }

    public void AtualizarAba()
    {
        System.out.println("Atualizando aba");
    }

    public void AbrirPagina(String url)
    {
        System.out.println("Abrindo página " + url);
    }
}
