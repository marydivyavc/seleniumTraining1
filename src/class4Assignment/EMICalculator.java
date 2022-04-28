package class4Assignment;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Please enter your name"); 
		  String name = sc.next();
		  System.out.println("Please enter your email"); 
		  String emailid= sc.next();
		  System.out.println("Enter principle amount in INR"); 
		  float p= sc.nextFloat();
		 
		System.out.println("Enter rate of interest");
		float i = sc.nextFloat();
		float r= i/(12* 100);//rate per month
		System.out.println("Enter duration in years");
		float d = sc.nextFloat();
		sc.close();
		float n = d*12;//no. of months
		double EMI=(p* r * Math.pow(1 + r, n) / (Math.pow(1 + r, n)-1));
		System.out.println("Thank you " + name+", Your EMI is "+EMI+ " INR and we have sent all details to your " + emailid);
	}

}
