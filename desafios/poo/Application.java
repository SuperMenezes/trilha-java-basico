package desafios.poo;

public abstract class Application 
{
    public String _appName;

    public Application(String appName)
    {
        _appName = appName;
    }

    public String GetAppName()
    {
        return _appName;
    }
}
