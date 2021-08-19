package com.bridgelabz.objectorientedprograms;

import java.util.Scanner;

public class StockAccountProcessing {

	private int numOfStock = 0;
	StockAccount[] StockAccountArray;
	
	public StockAccountProcessing() {
		StockAccountArray = new StockAccount[10];

	}
	
	public void addStock(String shareName,int noOfStoke, int noOfShare, int sharePrice,int stockSymbol) {
		StockAccountArray[numOfStock] = new StockAccount(shareName, noOfStoke, noOfShare, sharePrice,stockSymbol);
		numOfStock++;

	}

	private void calculateValue() {
		for (int i = 0; i < numOfStock; i++) {
			StockAccountArray[i].setTotalValueStock(this.calculateValue(StockAccountArray[i]));
			System.out.println(" name : " + StockAccount.shareName + "No of Stocks : " + StockAccount.noOfShare
					+ " total Stocke value : " + StockAccount.totalValueStock);
		}
		
	}

	private int calculateValue(StockAccount StockAccount) {
		int value = 0;
		for (int i = 0; i < StockAccountArray.length; i++) {
			value = (StockAccount.totalValueStock = StockAccount.noOfShare * StockAccount.sharePrice);

		}
		return value;
	}
	
	public void buyStock(int stockSymbol) {
		for(int i=0;i<StockAccountArray.length;i++) {
			
		}
	}
	
	
	
	
	public static void menu() {
		System.out.println("/******************************/");
		
		System.out.println("Enter 1 to calculate total value");
		System.out.println("Enter 2 to buy stock");
		System.out.println("Enter 3 to sell stock");
		System.out.println("Enter 4 to save stock");
		System.out.println("/******************************/");
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		StockAccountProcessing stockAccountProcessing = new StockAccountProcessing();
		Scanner sc = new Scanner(System.in);
		
		
		
			System.out.println("how many stocks u want to add");
			
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {

				System.out.println("Enter the name of stock");
				String shareName = sc.nextLine();
				String dummy = sc.nextLine();
				System.out.println("Enter the no of stocks");

				int noOfStoke = sc.nextInt();
				System.out.println("Enter the no of shares");
                int noOfShare = sc.nextInt();
                System.out.println("Enter the stock symbol");
				int stockSymbol = sc.nextInt();
				System.out.println("Enter the price of stock");
				int sharePrice = sc.nextInt();

				stockAccountProcessing.addStock(shareName, noOfStoke, noOfShare, sharePrice,stockSymbol);
			}
			menu();
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			while(choice!=5) {
				switch(choice) {
				
				case 1:
				       stockAccountProcessing.calculateValue();
                        break;
				case 2 :
					System.out.println("Enter the stocksymbol which stock u want to buy");
					int stockSymbol=sc.nextInt();
				       stockAccountProcessing.buyStock(stockSymbol);
				       break;
					
				
				}
				menu();
				choice=sc.nextInt();
				
			}
			
		
	}
}



