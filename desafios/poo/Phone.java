package desafios.poo;

public class Phone extends Application{
    public int numero;
    public String IMEI;

    public Phone() {
        super("Phone");
    }

    public void Ligar(String numero)
    {
        System.out.println("Ligando para " + numero);
    }

    public void CaixaPostal()
    {
        System.out.println("Caixa Postal");
    }

    public void Atender()
    {
        System.out.println("Atendendo");
    }
}
