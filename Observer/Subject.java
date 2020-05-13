package Observer;

import java.util.ArrayList;

import Observer.Observer.Code;

public class Subject {
	
	   private ArrayList<Observer> observers = new ArrayList<Observer>();
	   private String news;
	   private Code code;
	   private static Subject instance;
	   
	   private Subject() {}
	   
	   public static Subject getInstance() {
		   if(instance == null) {
			   synchronized (Subject.class) {
				   if(instance == null) {
					   instance = new Subject();
				   }
			   }
		   }
		return instance;
	   }
	   
	   

	   public String getNews() {
	      return news;
	   }

	   public void setNews(String news, Code code) {
	      this.news = news;
	      this.code = code;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update(code);
	      }
	   } 	
	}