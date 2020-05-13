package Observer;

public abstract class Observer {
	   protected Subject subject;
	   public abstract void update(Code code);
	   
	   enum Code 
	   { 
	       TR, PT, IT; 
	   } 
	   
}
