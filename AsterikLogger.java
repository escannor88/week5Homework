package Week05;

public class AsterikLogger implements logger {

	@Override
	public void log(String yay) {
		System.out.println("***" + yay + "***");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String nay) {
		System.out.println("*******************");
		System.out.println("***Error: " + nay + "***");
		System.out.println("*******************");
		// TODO Auto-generated method stub
		
	}

}
