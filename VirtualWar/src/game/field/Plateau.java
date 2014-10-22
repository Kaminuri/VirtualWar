package game.field;

import java.util.Random;

import move.Coordonnees;

public class Plateau {

    private final Cellule[][] tab;
    private final Random rdm = new Random();

    public Plateau(int l, int h){
        tab = new Cellule[l][h];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++)
                tab[i][j] = new Case(i, j);
        }
        tab[0][0] = new Base(0, 0, 1);
        tab[tab.length - 1][tab[0].length - 1] = new Base(tab.length - 1, tab[0].length-1, 2);
        int x;
        int y;
        /*for(int i = 0; i < pourcentage * 130 / 100; i++){
            do{
                x = rdm.nextInt(tab.length);
                y = rdm.nextInt(tab[0].length);
            }while(!(tab[x][y].estBase() == 0 && tab[x][y].estObstacle() == 0 && estValide(new Coordonnees(x, y))));
            tab[x][y].ajouteObstacle();
        }*/
    }
    
    public Cellule[][] getCellule(){
        return this.tab;
    }
    
    public boolean estValide(Coordonnees c){
    	return false;
    }

}
