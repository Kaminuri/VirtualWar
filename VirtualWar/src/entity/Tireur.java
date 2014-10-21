package entity;

import game.Vue;

import java.util.List;

import move.Coordonnees;

public class Tireur extends Robot{

	public Tireur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
		this.setEnergie(40);
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
		return -1;
	}

	@Override
	public int getDegatTir() {
		return -3;
	}

	@Override
	public int getDegatMine() {
		return -3;
	}

	@Override
	public String getType() {
		return "Tireur";
	}
	public String toString(){
		return " T" + this.getEquipe() + ' ';
	}

	@Override
	public List<Coordonnees> getDeplacement() {
		// TODO Auto-generated method stub
		return null;
	}

}
