package entity.robot;

import entity.Robot;
import game.Vue;

import java.util.List;

import move.Coordonnees;

public class Piegeur extends Robot{
	
	private int nbMine;
	
	public Piegeur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
		nbMine =10;
		this.setEnergie(50);
	}

	@Override
	public boolean peutTirer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCoutAtk() {
		return -2;
	}

	@Override
	public int getCoutDep() {
		return -2;
	}

	@Override
	public int getDegatTir() {
		return -6;
	}

	@Override
	public int getDegatMine() {
		return -6;
	}

	@Override
	public String getType() {
		return "Piegeur";
	}
	public String toString(){
		String res = "";
		if(this.getEquipe()==1)
			res = " P";
		if(this.getEquipe()==2)
			res = " p";
		return res;
	}

	@Override
	public List<Coordonnees> getDeplacement() {
		// TODO Auto-generated method stub
		return null;
	}

}
