package cz.fi.muni.pa165.hotelbookingmanagerapi.service;

//package cz.fi.muni.pa165.hotelbookingmanagerapi.service;

public class Observer2 extends Observer{

	   public Observer2(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Observer1 String: " + Integer.toOctalString( subject.getState() ) ); 
	   }
	}
