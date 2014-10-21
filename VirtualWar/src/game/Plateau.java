package game;

import java.util.Random;

import move.Coordonnees;

public class Plateau {

    private final Cellule[][] tab;
    private final Random rdm = new Random();

    public Plateau(){
        tab = new Cellule[15][10];
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
    
    public Cellule[][] getPlateau(){
        return this.tab;
    }
    
    /**Determine si il y a au moin un chemin valide entre les deux bases.
     * @param c
     * @return true si il y a au moins un chemin valide sinon false*/
    public boolean estValide(Coordonnees c){
    	return false;
    }

}
