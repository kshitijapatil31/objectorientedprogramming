package com.bridgelabz.objectorientedprograms;

public class StockAccount {

	public static String shareName;
	public static int noOfStoke;
	public static int noOfShare;
	public static int sharePrice;
	public static int totalValueStock;
	public static int stockSymbol;
	
	public StockAccount(String shareName, int noOfStoke, int noOfShare, int sharePrice, int stockSymbol) {
		super();
		this.shareName = shareName;
		this.noOfStoke = noOfStoke;
		this.noOfShare = noOfShare;
		this.sharePrice = sharePrice;
		this.stockSymbol = stockSymbol;
	}



	public String getShareName() {
		return shareName;
	}



	public void setShareName(String shareName) {
		this.shareName = shareName;
	}



	public int getNoOfStoke() {
		return noOfStoke;
	}



	public void setNoOfStoke(int noOfStoke) {
		this.noOfStoke = noOfStoke;
	}



	public int getNoOfShare() {
		return noOfShare;
	}



	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}



	public int getSharePrice() {
		return sharePrice;
	}



	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}



	public int getTotalValueStock() {
		return totalValueStock;
	}



	public void setTotalValueStock(int totalValueStock) {
		this.totalValueStock = totalValueStock;
	}



	public static int getStockSymbol() {
		return stockSymbol;
	}



	public static void setStockSymbol(int stockSymbol) {
		StockAccount.stockSymbol = stockSymbol;
	}



	@Override
	public String toString() {
		return "StockManagement [shareName=" + shareName + ", noOfStoke=" + noOfStoke + ", noOfShare=" + noOfShare
				+ ", sharePrice=" + sharePrice + ", totalValueStock=" + totalValueStock + "]";
	}

	
	
	
	


}


