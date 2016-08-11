package spyke.module;

import java.util.Random;

public class Module {
	
	private String name, description;
	private int key, color;
	private Category category;
	private boolean isEnabled, save;
	
	public Module(String n, String d, int k, Category c){
		name = n;
		description = d;
		key = k;
		category = c;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getKeybind(){
		return key;
	}
	
	public int getColor(){
		return color;
	}
	
	public Category getCategory(){
		return category;
	}
	
	public boolean getState(){
		return isEnabled;
	}
	
	public void toggleMod(){
		this.setState(!getState());
	}
	
	public final void setKeybind(int k){
		key = k;
	}
	
	public void onEnable(){
		Random gen = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append("0x");
		while(sb.length() < 10){
			sb.append(Integer.toHexString(gen.nextInt()));
		}
		sb.setLength(10);
		color = Integer.decode(sb.toString()).intValue();
	}
	
	public void onDisable(){
		
	}
	
	public final boolean isCategory(Category c){
		return c == category;
	}
	
	public void onToggle(){
		
	}
	
	public void setState(boolean b){
		isEnabled = b;
		onToggle();
		if(isEnabled){
			onEnable();
		}else{
			onDisable();
		}
	}
	
	public final void setSavable(boolean b){
		save = b;
	}
	
	public final boolean isSavable(boolean b){
		return b == save;
	}
	
	public boolean getSave(){
		return save;
	}
	
}
