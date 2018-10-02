package cz.fi.muni.pa165.hotelbookingmanagerapi.service;

public abstract class Observer {
	   protected Subject subject;
	   public abstract void update();
	}