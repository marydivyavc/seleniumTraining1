package SeleniumOnlineTraining;

public class SeleniumOnlineTraining {
	String trainerName= "Mukesh";
	String welcomeText="Welcome to Online Training Program";
	String thankYouText="Thank you showing interest in training program";
	String courseInfoText=" Training charges are ";
	String trainerInfoText=" and trainer name is ";
	String course;
		public static void main(String[] args) {
		//String price="200INR";
		//System.out.println(price );
		
		SeleniumOnlineTraining seleniumTraining =new SeleniumOnlineTraining();
		seleniumTraining.seleniumTraining();
		seleniumTraining.devOpsTraining();
		seleniumTraining.jmeterTraining();
	}

	

public void seleniumTraining() {
	String price= "200USD";
	String course = "Selenium";
	System.out.println("Welcome to Online Training Program");
	System.out.println("Thank you showing interest in training program");
	System.out.println(course+" Training charges are "+price+" and trainer name is "+trainerName);
	System.out.println();
}


public void devOpsTraining() {
	String price="300USD";
	String course = "DevOps";
	System.out.println("Welcome to Online Training Program");
	System.out.println("Thank you showing interest in training program");
	System.out.println(course+" Training charges are "+price+" and trainer name is "+trainerName);
	System.out.println();
}


public void  jmeterTraining() {
	String price="400USD";
	String course = "JMeter";
	System.out.println("Welcome to Online Training Program");
	System.out.println("Thank you showing interest in training program");
	System.out.println(course+" Training charges are "+price+" and trainer name is "+trainerName);
	System.out.println();
}

}

