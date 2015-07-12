package printermain;

import printings.IMachine;

public class Machine implements IMachine {
	
	protected boolean isOn;
	
	public Machine(boolean isOn){
		this.isOn = isOn; 
	}
	
	public void turnOn(){
		
		System.out.println("Printer is ON");
		
		isOn = true;
	}
	
	public void turnOff(){
		
		isOn = false; 
	}
	
	@Override
	public boolean isOn(){
		return isOn; 
	}

}
