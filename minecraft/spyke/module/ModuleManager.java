package spyke.module;

import java.util.ArrayList;

public class ModuleManager {
	
	public static ArrayList<Module> mods;
	
	public ModuleManager(){
		mods = new ArrayList();
	}
	
	//Add mods to the client
	public void addMods(){

	}
	
	public static ArrayList<Module> getModules(){
		return mods;
	}
	
	public Module getModule(Class <? extends Module> c){
		for(Module m: mods){
			if(m.getClass() == c){
				return m;
			}
		}
		return null;
	}
	
	public void setModuleState(Class <? extends Module> c, boolean s){
		for(Module m: mods){
			if(c == m.getClass()){
				m.setState(s);
				break;
			}
		}
	}
	
}
