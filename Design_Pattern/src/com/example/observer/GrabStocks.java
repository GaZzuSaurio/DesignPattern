package com.example.observer;

public class GrabStocks {
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setApplePrice(200.00);
		stockGrabber.setGooglePrice(144.00);

		StockObserver observer2 = new StockObserver(stockGrabber);

		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setApplePrice(200.00);
		stockGrabber.setGooglePrice(144.00);
		
		Runnable getIbm = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getApple = new GetTheStock(stockGrabber, 2, "APPLE", 200.00);
		Runnable getGoogle = new GetTheStock(stockGrabber, 2, "GOOGLE", 144.00);
		
		new Thread(getIbm).start();
		new Thread(getApple).start();
		new Thread(getGoogle).start();
	}

}
