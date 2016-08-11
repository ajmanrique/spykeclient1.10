package spyke.main;

public class Spyke {
	
	private final String CLIENT_NAME = "Spyke";
	
	private static Spyke spyke = new Spyke();
	
	public static Spyke getInstance(){
		return spyke;
	}
	
	public static void initClient(){
		
	}
	
}
