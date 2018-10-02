package cz.fi.muni.pa165.hotelbookingmanagerapi.service;

import java.util.ArrayList;

public class Task implements Observable{

	ArrayList<ObserverNew> users=new ArrayList<ObserverNew>();
	
	private boolean isPending=true;
	
	

	public void addObserver(ObserverNew o) {
		// TODO Auto-generated method stub
		users.add(o);
		
	}

	public void removeObserver(ObserverNew o) {
		// TODO Auto-generated method stub
		users.remove(o);
		
		
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(ObserverNew user:users){
			user.update();
		}
		
	}

	public boolean isPending() {
		return isPending;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
		notifyObserver();
	}

	public void notifyObserver(ObserverNew o) {
		// TODO Auto-generated method stub
		
	}

}
