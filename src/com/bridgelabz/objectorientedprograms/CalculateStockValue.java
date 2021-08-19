package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

public class CalculateStockValue {

	private int numOfStock = 0;
	StockManagement[] stockManagementArray;

	public CalculateStockValue() {
		stockManagementArray = new StockManagement[10];

	}

	public void addStock(String shareName,int noOfStoke, int noOfShare, int sharePrice) {
		stockManagementArray[numOfStock] = new StockManagement(shareName, noOfStoke, noOfShare, sharePrice);
		numOfStock++;

	}

	private void calculateValue() {
		for (int i = 0; i < numOfStock; i++) {
			stockManagementArray[i].setTotalValueStock(this.calculateValue(stockManagementArray[i]));
			
		}
		System.out.println(" name : " + StockManagement.shareName + "No of Stocks : " + StockManagement.noOfShare
				+ " total Stocke value : " + StockManagement.totalValueStock);
	}

	private int calculateValue(StockManagement StockManagement) {
		int value = 0;
		for (int i = 0; i < stockManagementArray.length; i++) {
			value = (StockManagement.totalValueStock = StockManagement.noOfShare * StockManagement.sharePrice);

		}
		return value;
	}

	public static void main(String[] args) {

		CalculateStockValue calculateValue = new CalculateStockValue();
		System.out.println("how many stocks u want to add");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {

			System.out.println("Enter the name of stock");
			String shareName = sc.nextLine();
			String dummy = sc.nextLine();
			System.out.println("Enter the no of stocks");

			int noOfStoke = sc.nextInt();
			System.out.println("Enter the no of shares");

			int noOfShare = sc.nextInt();
			System.out.println("Enter the price of stock");
			int sharePrice = sc.nextInt();

			calculateValue.addStock(shareName, noOfStoke, noOfShare, sharePrice);

			calculateValue.calculateValue();

		}

	}
}
