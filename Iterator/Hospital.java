package Iterator;

import java.util.ArrayList;

public class Hospital implements Container{

		public ArrayList<Patient> list = new ArrayList<Patient>();
		
		public Hospital() {	
			list.add( new Patient(111,"umuttepe","ali",false) );
			list.add( new Patient(222,"seka devlet","ayse",true) );
			list.add( new Patient(333,"kocaeli devlet","ahmet",false) );
			list.add( new Patient(444,"umuttepe","adnan",true) );
			list.add( new Patient(555,"seka devlet","alp",true) );
			list.add( new Patient(666,"kocaeli devlet","ata",true) );
		}
		
	   @Override
	   public Iterator getIterator() {
	      return new IteratorWithoutTC();
	   }
	   
	   private class IteratorWithoutTC implements Iterator {

		      private int index;

		      @Override
		      public boolean hasNext() {
		      
		         if(index < list.size()){
		            return true;
		         }
		         return false;
		      }

		      @Override
		      public Object next() {
		      
		         if(this.hasNext()){
		        	 return list.get(index).name+" "+list.get(index).hospitalName+" "+list.get(index++).isCorona;
		         }
		         return null;
		      }		
		   }
}
