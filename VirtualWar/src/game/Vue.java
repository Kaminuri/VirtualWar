package game;

import game.field.Plateau;

public class Vue {
	private final String[][] tab;
	
	public Vue(Plateau plateau, int equipe){
        tab = new String[plateau.getCellule().length][plateau.getCellule()[0].length];      
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                if(plateau.getCellule()[i][j].contientMine() == equipe)                     
                    tab[i][j] = plateau.getCellule()[i][j].toString();
                else if(plateau.getCellule()[i][j].contientMine() == 0) 
                    tab[i][j] = plateau.getCellule()[i][j].toString();
                else
                    tab[i][j] = "   ";
            }
        }
    }
	
	public void afficherPlateau(){
		String res="| 0  ";
		for(int i=1; i<tab[0].length;++i){
			if(i<10){
				res = res + "| " + i+ "  ";
			}
			if(i>=10){
				res = res + "| " + i+ " ";
			}
		}
		res = res + "|x/y";
        //System.out.print("| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  |x/y\n");
		System.out.println(res);
        System.out.print("+");
        
        for (String s : tab[0])
            System.out.print("----+");
        
        System.out.print("-----");
        
        for (int j = 0; j < tab.length; j++) {
            System.out.print("\n|");
            
            for (int k = 0; k < tab[0].length; k++)
                System.out.print(tab[j][k] + "|");
            
            System.out.print("| " + j);
            System.out.print("\n+");
            
            for (String s : tab[0])
                System.out.print("----+");
            
            System.out.print("-----");
        }   
    }
	
	
	public String[][] getPlateau(){
        return tab;
    }



}
