package game;

import java.util.ArrayList;

import move.Coordonnees;
import entity.Joueur;
import entity.Robot;
import entity.robot.Char;
import entity.robot.Piegeur;
import entity.robot.Tireur;

public class Equipe {
	private final ArrayList <Robot> compo;
	
	public Equipe (Joueur joueur, Coordonnees c){	
        int nbTireur = joueur.getNbTireur();
        int nbPiegeur = joueur.getNbPiegeur();
        int nbChar = joueur.getNbChar();
        System.out.println("\nEquipe " + joueur.getEquipe());
        compo = new ArrayList <Robot> ();    
        for (int i = 0; i < nbTireur; i++){
            compo.add(new Tireur(c.getLargeur(), c.getHauteur(), joueur.getEquipe()));
        }
        for (int i = 0; i < nbPiegeur; i++){
            compo.add(new Piegeur(c.getLargeur(), c.getHauteur(), joueur.getEquipe()));
        }
        for (int i = 0; i < nbChar; i++){
            compo.add(new Char(c.getLargeur(), c.getHauteur(), joueur.getEquipe()));
        }     
    }
	
	public int getNbRobot(){
        return compo.size();
    }
	
	public ArrayList<Robot> getEquipe(){
        return compo;
    }
	
	public Robot getRobot(int choix){
        return compo.get(choix);
    }
	
	public void retireMort(){
        for(int i = 0; i < compo.size(); i++)
            if(compo.get(i).getEnergie() <= 0)
                compo.remove(i);
    }
	public boolean estVide(){
        return compo.isEmpty();
    }


}
