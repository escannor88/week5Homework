package Week05;

public class SpacedLogger implements logger {

	@Override
	public void log(String yay) {
		System.out.println(yay.replace("", " "));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String nay) {
		System.out.println("Error: " + nay.replace("", " "));
		// TODO Auto-generated method stub
		
	}
	

}
