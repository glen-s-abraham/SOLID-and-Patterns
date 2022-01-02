package BehaviouralPatterns;

import java.util.ArrayList;
import java.util.List;

//the observer pattern defines a one-to-many dependency between given objects
//So that when one object changes changes states all of it's dependants are
//notified automatically.
//Observer pattern is quite common in java programming.

interface Observer{
	public void update(int pressure,int temperature,int humidity);
}
interface Subject{
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyAllObservers();
}
class WeatherStation implements Subject{
	
	private int pressure;
	private int temperature;
	private int humidity;
	
	private List<Observer> observers;
	
	
	public WeatherStation() {
		this.observers = new ArrayList<>();
	}
	
	
	
	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}



	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObservers();
	}



	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}



	@Override
	public void addObserver(Observer o) {
		this.observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
		
	}

	@Override
	public void notifyAllObservers() {
		for(Observer o:observers)
			o.update(pressure, temperature, humidity);
		
	}
	
}

class WeatherObserver implements Observer{
	
	private int pressure;
	private int temperature;
	private int humidity;
	private Subject subject;
	
	
	
	public WeatherObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}



	@Override
	public void update(int pressure, int temperature, int humidity) {
		this.pressure=pressure;
		this.temperature=temperature;
		this.humidity=humidity;
		showData();
		
	}



	private void showData() {
		System.out.println("Pressure:"
				+this.pressure
				+"Temperature:"
				+this.temperature
				+"Humidity:"
				+this.humidity);
		
	}
	
}

public class ObserverPattern {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
		
		weatherStation.setHumidity(100);
		weatherStation.setPressure(200);
		weatherStation.setTemperature(37);
		
	}
}
