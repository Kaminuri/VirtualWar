package entity.robot;

import entity.Robot;

import java.util.List;

import move.Coordonnees;

public class Piegeur extends Robot{
	
	private int nbMine;
	
	public Piegeur( int l, int h, int equipe) {
		super( l, h, equipe);
		nbMine =10;
		this.setEnergie(50);
	}
	public int getNbMine(){
		return nbMine;
	}

	@Override
	public boolean peutTirer() {
		if(nbMine !=0 && true){
			return true;
		}
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
