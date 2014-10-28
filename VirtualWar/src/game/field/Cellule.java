package game.field;

import entity.Robot;
import move.Coordonnees;

public abstract class Cellule {
	protected int mine =0;
	protected int base=0;
	private Coordonnees c;
	private Robot robot;
	String image;
	public Cellule(int l, int h){
		c = new Coordonnees(l, h);
	}
	public int contientMine(){
		return mine;
	}
	public int estBase(){
		return base;
	}
	public Coordonnees getCoordonnees(){
		return c;
	}
	public Robot getContenu(){
		return robot;
	}
	public String toString(){
		return image;
	}
	abstract void deplaceSur(Robot robot);
	abstract void ajoute(int equipe);
	abstract void videCase();
}
