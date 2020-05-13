package Iterator;

public class Iterator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();
		for(Iterator iterator = hospital.getIterator(); iterator.hasNext();) {
	         String name = (String)iterator.next();
	         System.out.println("patient : " + name);
		}
	}
	

	
	

}
