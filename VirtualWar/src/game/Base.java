package game;

import java.util.ArrayList;

import entity.Robot;

public class Base extends Cellule{
	private final ArrayList <Robot> listeRobots;
	public Base(int x, int y, int equipe) {
        super(x, y);
        listeRobots = new ArrayList <Robot>();
        super.image = " B" + equipe + ' ';
        super.base = equipe;
    }


	@Override
	void deplaceSur(Robot robot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void ajoute(int equipe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void videCase() {
		// TODO Auto-generated method stub
		
	}

}
