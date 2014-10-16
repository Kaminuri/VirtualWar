package move;

import entity.Robot;

public abstract class Action {
	private Robot robot;
	private Coordonnees c;
	public Action (Robot r, Coordonnees c){
		
	}
	public Coordonnees getDirection(){
		return c;
	}
	public Coordonnees getObjectif(){
		return new Coordonnees(-1, -1);
	}
	abstract void agit();
}
