//Part of Obeserver Design Pattern implementation
public class Announcer implements Observer 
{
    public Announcer(String name)
    {
        super(name);
    }
    
    //@Override
    public void update(String message) 
    {
        System.out.println("Announcement: " + message);
    }
}

