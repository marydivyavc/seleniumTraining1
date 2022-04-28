package handson_1;

public class Bicycle {
int cadence=0;
int speed=1;
int gear=1;
void changecadence(int newvalue) {
	cadence=newvalue;
}
void changegear(int newvalue)
{
	gear=newvalue;
}
void speedup(int increment) {
	speed=speed+increment;
}

void applybreak(int decrement)
{
	speed=speed-decrement;
	
}
void printStates() {
System.out.println("cadence: "+cadence+" speed: "+speed+" gear:"+  gear);
}
}
