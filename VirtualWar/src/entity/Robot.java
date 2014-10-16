package entity;

import java.util.List;

import move.Coordonnees;
import game.Vue;

public abstract class Robot {
	private int energie;
	private int equipe;
	private Coordonnees c;
	public Robot(Vue vue, int l, int h, int equipe){
	}
	
	public boolean estSurBase(){return false;}
	
	public int getEnergie() {
		return energie;
	}
	public void setEnergie(int energie) {
		this.energie = energie;
	}
	public int getEquipe() {
		return equipe;
	}
	public void setEquipe(int equipe) {
		this.equipe = equipe;
	}
	public Coordonnees getCoordonnees() {
		return c;
	}
	public void setC(Coordonnees c) {
		this.c = c;
	}
	abstract public boolean peutTirer();
	public abstract int getCoutAction();
	public abstract int getCoutDep();
	public abstract int getDegatTir();
	public abstract int getDegatMine();
	public abstract String getType();
	public abstract public List<Coordonnees> getDeplacement();
	
}
