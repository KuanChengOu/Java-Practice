import static java.lang.System.*;

import java.util.*;

public class StockClass {

	public static void main(String[] args) {
		
		Scanner scannerIn = new Scanner(in);
		
		StockClass stockClass = new StockClass();
		StockClass.Stock stock = stockClass.new Stock();
		
		out.print("Enter your Stock's Symbol : ");
		stock.setSymbol(scannerIn.next());
		
		out.print("Enter your Stock's Name : ");
		stock.setName(scannerIn.next());
		
		out.print("Enter your the stock price for the previous day : ");
		stock.setPreviousClosingPrice(scannerIn.nextDouble());

		out.print("Enter your the stock price for the current time : ");
		stock.setCurrentPrice(scannerIn.nextDouble());
		
		out.print("\n");
		out.println("Stock's Symbol.: " + stock.getSymbol());
		out.println("Stock's Name.: " + stock.getName());
		out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
		out.println("Current Price: " + stock.getCurrentPrice());
		out.println("Price Change: " + stock.changePercent());
	}
	
	private class Stock {
		
		private String symbol;
		private String name;
		private double previousClosingPrice;
		private double currentPrice;

		public String getSymbol() {
			return symbol;
		}

		public String getName() {
			return name;
		}

		public double getPreviousClosingPrice() {
			return previousClosingPrice;
		}

		public double getCurrentPrice() {
			return currentPrice;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPreviousClosingPrice(double price) {
			this.previousClosingPrice = price;
		}

		public void setCurrentPrice(double price) {
			this.currentPrice = price;
		}

		public double changePercent() {
			return (currentPrice - previousClosingPrice) / previousClosingPrice;
		}
	}
}