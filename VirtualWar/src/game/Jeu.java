package game;

import move.Coordonnees;
import entity.Joueur;
import entity.player.Humain;
import game.field.Plateau;

public class Jeu{
	public static int HauteurPlateau = 8;
	public static int LargeurPlateau = 8;
	public static void main(String[] args){
		Joueur j = new Humain(1);
		Joueur j2 = new Humain(2);
		Plateau pl = new Plateau(HauteurPlateau, LargeurPlateau);
		Vue v1 = new Vue(pl, 1);
		Vue v2 = new Vue(pl, 2);
		v1.afficherPlateau();
		System.out.println("Choix Robot J1 :");
		System.out.println("Nombre de tireur :");
		
	}
}
