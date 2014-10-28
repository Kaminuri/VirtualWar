package game;

import entity.Joueur;
import entity.player.Humain;
import game.field.Plateau;

public class Jeu {
	public static void main(String[] args){
		Joueur j = new Humain(1);
		Joueur j2 = new Humain(2);
		Plateau pl = new Plateau(5, 5);
		Vue v1 = new Vue(pl, 1);
		Vue v2 = new Vue(pl, 2);
		v1.afficherPlateau();
	}
}
