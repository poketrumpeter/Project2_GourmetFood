package Logistics;
//Subject Interface for Observer Implementation
public interface Subject {
	//Function declerations to register, remove and notify observers from an instance of Observer
	public void registerObserver(Observer O);
	public void removeObserver(Observer O);
	public void notifyObservers(String message);

}
