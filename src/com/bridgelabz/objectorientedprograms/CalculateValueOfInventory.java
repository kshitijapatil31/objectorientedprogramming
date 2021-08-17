package com.bridgelabz.objectorientedprograms;

public class CalculateValueOfInventory {
	
	
private int numOfInventory=0;
private ObjectOrientedPrograme[] objectOrientedArray;


public CalculateValueOfInventory() {
	objectOrientedArray=new ObjectOrientedPrograme[10];
	
}

public void addInventory(String name,int weight,int pricePerKg) {
	objectOrientedArray[numOfInventory]=new ObjectOrientedPrograme(name,weight,pricePerKg);
	numOfInventory++;

}

private void calculateValue() {
	for(int i=0;i<numOfInventory;i++) {
		objectOrientedArray[i].setInventoryValue(this.calculateValue(objectOrientedArray[i]));
	System.out.println(objectOrientedArray[i]);
	}
}
private int calculateValue(ObjectOrientedPrograme objectOrientedPrograme) {
	
	int value=(ObjectOrientedPrograme.inventoryValue=ObjectOrientedPrograme.weight*ObjectOrientedPrograme.pricePerKg);
    
	
	return value;
}






public static void main(String[] args) {
		CalculateValueOfInventory calculateValue=new CalculateValueOfInventory();

		calculateValue.addInventory("rice",20,20);
		calculateValue.addInventory("pulses",30,35);
		calculateValue.addInventory("wheat",40,45);
		calculateValue.calculateValue();
	}

}
