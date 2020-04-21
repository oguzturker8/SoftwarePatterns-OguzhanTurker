package Builder;

public class BuilderMain{
	public static void main(String args[]) {
		Vehicle vehicle1, vehicle2, vehicle3, vehicle4;
		
		vehicle1 = Vehicle.Builder.newInstance().setType("Car").setCustomerName("Oguz").setBrand("BMW").setPrice("215000").setWheel(4).build();
		vehicle1.log();
		
		vehicle2 = Vehicle.Builder.newInstance().setType("Plane").setCustomerName("Oguz2").setBrand("Boeing").setPrice("2,489,646,600.00").setWing(2).build();
		vehicle2.log();
		
		vehicle3 = Vehicle.Builder.newInstance().setType("Ship").setCustomerName("Oguz3").setBrand("Royal Caribbean").setPrice("9,414,630,000.00").setIsFloating(true).build();
		vehicle3.log();
		
		vehicle4 = Vehicle.Builder.newInstance().setType("Truck").setCustomerName("Oguz4").setBrand("Mercedes-Benz").setPrice("1,500,000,00").setIsFloating(true).build();
		vehicle4.log();
		
	}
}