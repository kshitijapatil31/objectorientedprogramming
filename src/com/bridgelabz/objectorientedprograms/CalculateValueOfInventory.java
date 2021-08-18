package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

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
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Inventory name");
		String name=sc.nextLine();
		System.out.println("Enter the weight of inventory");
		int weight=sc.nextInt();
		System.out.println("Enter the price of inventory");
		int pricePerKg=sc.nextInt();
		calculateValue.addInventory(name,weight,pricePerKg);
		
		calculateValue.calculateValue();
	}

}
