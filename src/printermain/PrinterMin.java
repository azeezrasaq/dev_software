package printermain;

import printings.IMachine;
import printings.Printer;

public class PrinterMin {

	public static void main(String[] args) {
	
		Printer myPrinter = new Printer(false, "WDAXCC"); 
		//myPrinter.printColour();
	
		//myPrinter.loadPaper(5);
		//myPrinter.print(6);
		myPrinter.turnOn();
	
		
	}

}
