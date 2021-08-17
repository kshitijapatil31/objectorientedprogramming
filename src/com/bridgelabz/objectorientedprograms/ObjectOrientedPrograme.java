package com.bridgelabz.objectorientedprograms;

public class ObjectOrientedPrograme {

	public static String name;
	public static  int weight;
	public static int pricePerKg;
	public static int inventoryValue;
	
	
	public ObjectOrientedPrograme(String name, int weight, int pricePerKg) {
		super();
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	
	public int getInventoryValue() {
		return inventoryValue;
	}
	public void setInventoryValue(int inventoryValue) {
		this.inventoryValue = inventoryValue;
	}
	@Override
	public String toString() {
		return "ObjectOrientedPrograme [name=" + name + ", weight=" + weight + ", pricePerKg=" + pricePerKg
				+ ", inventoryValue=" + inventoryValue + "]";
	}
	
	

	
}
