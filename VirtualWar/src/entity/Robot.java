package entity;

import java.util.List;

import move.Coordonnees;
import game.Vue;

public abstract class Robot {
	private int energie;
	private int equipe;
	private Coordonnees c;
	private Vue vue;
	
	public Robot(int l, int h, int equipe){
	}
	
	public boolean estSurBase(){return false;}
	
	public int getEnergie() {
		return energie;
	}
	public Vue getVue(){
		return vue;
	}
	public void setVue(Vue v){
		vue = v;
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
	public String toString(){
		return "[" + this.getType() + "/ Energie :" + energie + "/ Equipe :" + equipe + "/ Coord :" + c + "]";
	}
	abstract public boolean peutTirer();
	public abstract int getCoutAtk();
	public abstract int getCoutDep();
	public abstract int getDegatTir();
	public abstract int getDegatMine();
	public abstract String getType();
	public abstract List<Coordonnees> getDeplacement();
	
}
