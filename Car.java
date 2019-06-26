package project0;

public class Car {
	private String Make;
	private String Model;
	private int yearManufactured;
	private String color;
	private String chassisType;
	private Double cost;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public String getColor() {
		return color;
	}
	public String getChassisType() {
		return chassisType;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setChassisType(String chassisType) {
		this.chassisType =chassisType;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	
	@Override
	public String toString() {
		return "Car [Make=" + Make + ", Model=" + Model + ", yearManufactured=" + yearManufactured + "]";
	}
	

}
