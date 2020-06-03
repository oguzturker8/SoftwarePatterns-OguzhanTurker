package OpenClosed;

import java.util.List;

public class Blacksmith {
	
	
	private static Blacksmith instance;
	
	private Blacksmith() {}
	
	 public static Blacksmith getInstance(){  
		   if (instance == null){  
		      synchronized(Blacksmith.class){  
		        if (instance == null){  
		        	instance = new Blacksmith();
		        }  
		    }              
		    }  
		  return instance;  
		 }
	 
	 
	 public void forge(List<Weapon> weapons) {
		 System.out.println("Blacksmith forge list:");
		 for (Weapon weapon: weapons) {
			 weapon.log();
		 } 	 
	 }
	
	

}
