package entity;

import game.Vue;

import java.util.List;

import move.Coordonnees;

public class Tireur extends Robot{

	public Tireur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
		this.setEnergie(20);
	}

	@Override
	public boolean peutTirer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCoutAtk() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCoutDep() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDegatTir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDegatMine() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		return "Tireur";
	}

	@Override
	public List<Coordonnees> getDeplacement() {
		// TODO Auto-generated method stub
		return null;
	}

}
