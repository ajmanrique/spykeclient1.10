package spyke.main;

import spyke.module.ModuleManager;

public class Spyke {
	
	private final String CLIENT_NAME = "Spyke";
	
	private static Spyke spyke = new Spyke();
	
	private static ModuleManager modManager;
	
	public static Spyke getInstance(){
		return spyke;
	}
	
	public static void initClient(){
		modManager = new ModuleManager();
	}
	
	public static ModuleManager getModuleManager(){
		return modManager;
	}
	
}
