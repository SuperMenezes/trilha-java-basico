package desafios.poo;

public class IPhone {

    public Application[] applications;
    
    public IPhone(){
        applications = new Application[]{new Ipod(), new Phone(), new Browser()};
    }
    
}
