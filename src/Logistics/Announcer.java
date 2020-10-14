package Logistics;
//Part of Obeserver Design Pattern implementation
public class Announcer implements Observer {
    @Override
    public void update(GourmetFoodShop shop, String message)
    {
        System.out.println("***** Start of Observer Announcement *****");
        System.out.println("Announcement:  The shop is " + message);
        System.out.println("***** End of Observer Announcement *****");
    }
}
