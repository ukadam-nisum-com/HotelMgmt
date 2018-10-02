package cz.fi.muni.pa165.hotelbookingmanagerapi.service;

public class ObserverPatternDemo {
	   public static void main(String[] args) {
	      Subject subject = new Subject();

	      new Observer1(subject);
	      new Observer2(subject);
	      new Observer1(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
	}
