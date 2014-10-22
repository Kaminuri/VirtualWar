package entity.player;

import entity.Joueur;
import entity.Robot;

public class IA extends Joueur{

	public IA(int equipe) {
		super(equipe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getNbTireur() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNbPiegeur() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNbChar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int choixRobot(int nbRobot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int choixAction() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int directionAttaque(Robot robot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int directionDeplacement(Robot robot) {
		// TODO Auto-generated method stub
		return 0;
	}

}
