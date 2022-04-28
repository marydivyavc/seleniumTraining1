
package handson_1;

public class BicycleDemo {

	public static void main(String[] args) {
		
		
		//create two objectes
		Bicycle bike1=new Bicycle();
		Bicycle bike2=new Bicycle();
		//invoke methods for those objects
		bike1.changecadence(50);
		bike1.changegear(1);
		bike1.speedup(2);
		bike1.printStates();
		
		bike2.changecadence(51);
		bike2.changegear(2);
		bike2.speedup(3);
		bike2.printStates();
		
	}
}



