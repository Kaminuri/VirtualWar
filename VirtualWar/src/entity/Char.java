package entity;

import game.Vue;

import java.util.List;

import move.Coordonnees;

public class Char extends Robot{

	public Char(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
		this.setEnergie(60);
	}

	@Override
	public boolean peutTirer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCoutAtk() {
		return -1;
	}

	@Override
	public int getCoutDep() {
		
		return -5;
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
		return "Char";
	}

	@Override
	public List<Coordonnees> getDeplacement() {
		// TODO Auto-generated method stub
		return null;
	}

}
