package printings;

import printermain.Machine;
import printermain.PaperTray;

public class Printer<J> implements IMachine
{
	
	private String modelNumber; 
	private  PaperTray papersTray = new PaperTray();
	private Machine machine;
	
	public Printer(boolean isOn, String modelNumber){
		machine = new Machine(isOn); 
		this.modelNumber = modelNumber; 
		
	}
	public void print(int copies){
		
		String onStatus = "";
		if(machine.isOn()){
			onStatus = " Printer is On";
		}else {
			onStatus = " Printer is Off";
			 
	}
		String textToPrint = modelNumber + onStatus;
		
		while(copies > 0 && papersTray.isEmpty())
		{
			
//			boolean ssdld  =papersTray.isEmpty(); 
//			System.out.println("The above two are not true" +ssdld);
//		for(int i  =0; i<copies; i++)
				System.out.println(textToPrint);
				 copies --;
				papersTray.usePaper();
			
		}
		 if(!papersTray.isEmpty())
		 	{

				System.out.println("Please Load Paper!!!");
			}
		
	}
	
	public void printColour(){
		
		String[]  colour = new String[] {"Green", "Brown", "Grey", "Yellow"};
		for(String currentColour : colour){
			
			if("Grey".equals(currentColour)){
				continue; 
			}
			
			System.out.println(currentColour);
		}
	}
	
	public void print(String text){
		
		System.out.println(text);
	}
	
	public String getModelNumber(){
		
		return modelNumber;
	}
	public void loadPaper(int count) {
		papersTray.addPaper(count);
		
	}
	
	@Override
	public void turnOn(){
	System.out.println("Printer is Warming Up!!");
	
	machine.turnOn();
		
	}
	
	@Override
	public void turnOff() {
		
		System.out.println("Printer is Off");
		machine.turnOff();
		
	}
	@Override
	public boolean isOn(){
		return machine.isOn();
		
		
	}

}


