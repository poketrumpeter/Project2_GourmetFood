package Logistics;
//Part of Obeserver Design Pattern implementation
public class Announcer implements Observer 
{
    
    //@Override
    public void update(String message) 
    {
        System.out.println("Announcement: " + message);
    }
}

