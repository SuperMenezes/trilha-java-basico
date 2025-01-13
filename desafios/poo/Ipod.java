package desafios.poo;

public class Ipod  extends Application {
    public String[] songs;
    
    public Ipod(){
        super("Ipod");
        songs = new String[]{"Song 1", "Song 2", "Song 3"};
    }

    public void Play()
    {
        System.out.println("Playing");
    }

    public void Pause()
    {
        System.out.println("Pausing");
    }

    public void SelecionarMusica(int index)
    {
        System.out.println("Escolhendo música " + songs[index]);
    }

}
