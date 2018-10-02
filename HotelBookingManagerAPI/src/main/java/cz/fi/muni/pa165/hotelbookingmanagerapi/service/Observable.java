package cz.fi.muni.pa165.hotelbookingmanagerapi.service;

public interface Observable {
	
	public void addObserver(ObserverNew o);
	public void removeObserver(ObserverNew o);
	public void notifyObserver(ObserverNew o);

}
