package Week05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AsterikLogger logger = new AsterikLogger();
		logger.log("Hey there");
		logger.error("What is up");
		
		SpacedLogger loggered = new SpacedLogger();
		loggered.log("yay");
		loggered.error("nay");
		

	}

}
