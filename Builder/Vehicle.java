package Builder;

public class Vehicle {
	
	private String type;
	private String customerName;
	private String brand;
	private String price;
	private int wheel;
	private int wing;
	private boolean isFlying;
	private boolean isFloating;
	
	public Vehicle(Builder builder) {
		this.type = builder.type;
		this.customerName = builder.customerName;
		this.brand = builder.brand;
		this.price = builder.price;
		this.wheel = builder.wheel;
		this.wing = builder.wing;
		this.isFlying = builder.isFlying;
		this.isFloating = builder.isFloating;
	}
	
	public static class Builder{

		private String type;
		private String customerName;
		private String brand;
		private String price;
		private int wheel;
		private int wing;
		private boolean isFlying;
		private boolean isFloating;
		
		
		public static Builder newInstance() {
			return new Builder();
		}	
		
		public Builder setType(String type) {
			this.type = type;
			return this;
		}
		public Builder setCustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}
		public Builder setBrand(String brand) {
			this.brand = brand;
			return this;
		}
		public Builder setPrice(String price) {
			this.price = price;
			return this;
		}
		public Builder setWheel(int wheel) {
			this.wheel = wheel;
			return this;
		}
		public Builder setWing(int wing) {
			this.wing = wing;
			return this;
		}
		public Builder setIsFlying(boolean isFlying) {
			this.isFlying = isFlying;
			return this;
		}
		public Builder setIsFloating(boolean isFloating) {
			this.isFloating = isFloating;
			return this;
		}
		public Vehicle build() {
			return new Vehicle(this);
		}
	}
	
	public void log() {
		System.out.println("vehicle: "+this);
		System.out.println("type : "+type);
		System.out.println("customerName : "+customerName);
		System.out.println("brand : "+brand);
		System.out.println("price : "+price+"TL");
		System.out.println("wheel : "+wheel);
		System.out.println("wing : "+wing);
		System.out.println("isFlying : "+isFlying);
		System.out.println("isFloating : "+isFloating);
		System.out.println("");
	}
}











