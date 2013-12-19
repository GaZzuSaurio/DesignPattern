package com.example.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	public StockGrabber() {

	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public void setIbmPrice(double p) {
		this.ibmPrice = p;
		notifyObserver();
	}

	public void setApplePrice(double p) {
		this.applePrice = p;
		notifyObserver();
	}

	public void setGooglePrice(double p) {
		this.googlePrice = p;
		notifyObserver();
	}

}
