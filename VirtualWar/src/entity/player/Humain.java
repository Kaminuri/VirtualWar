package entity.player;

import java.util.Scanner;

import entity.Joueur;
import entity.Robot;

public class Humain extends Joueur{
	Scanner sc;
	
	public Humain(int equipe) {
		super(equipe);
		sc = new Scanner(System.in);
	}

	@Override
	public int getNbTireur() {
		return super.nbTireur;
	}

	@Override
	public int getNbPiegeur() {
		return super.nbPiegeur;
	}

	@Override
	public int getNbChar() {
		return super.nbChar;
	}

	@Override
	public int choixRobot(int nbRobot) {
		return sc.nextInt();
	}

	@Override
	public int choixAction() {
		return sc.nextInt();
	}

	@Override
	public int directionAttaque(Robot robot) {
		return sc.nextInt();
	}

	@Override
	public int directionDeplacement(Robot robot) {
		return sc.nextInt();
	}

}
