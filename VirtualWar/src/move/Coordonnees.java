package move;

public class Coordonnees {
	private int largeur;
	private int hauteur;
	public Coordonnees(int l, int h){
		largeur=l;
		hauteur=h;
	}
	public int getLargeur() {
		return largeur;
	}
	public int getHauteur() {
		return hauteur;
	}
	public String toString(){
		return "["+largeur+", "+hauteur+"]";
	}
	public Coordonnees ajout(Coordonnees coord){
		return new Coordonnees(-1, -1);
	}
}
