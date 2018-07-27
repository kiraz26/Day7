package airConditioner;

public class AirConditioner {
	
	String model;
	int temperature;
	boolean isOn;
	
	public void turnOn() {
		System.out.println("turning on "+model);
		isOn=true;
	}
	public void turnOff() {
		System.out.println("turning off "+model);
		isOn=false;
	}
	public void setTemperature(int temp) {
		System.out.println("setting temperature to "+temp);
		temperature=temp;
		
	}
	public void turnUpTemperature(int addedValue) {
		
		
		temperature=temperature+addedValue;
		
		
	}
}
