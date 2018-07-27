package airConditioner;



public class AirConditionerControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirConditioner ac1= new AirConditioner();
		ac1.model="Samsung";
		ac1.isOn=false;
		ac1.temperature=88;
		
		System.out.println(ac1.temperature);
		
		System.out.println(ac1.isOn);
		
		ac1.turnOn();
		
		System.out.println(ac1.isOn);
		
		ac1.turnOff();
		
		System.out.println(ac1.isOn);
		
		ac1.setTemperature(70);
		
		System.out.println(ac1.temperature);
		
		ac1.turnUpTemperature(10);
		
		System.out.println(ac1.temperature);
		
		
		
		
	}

}
