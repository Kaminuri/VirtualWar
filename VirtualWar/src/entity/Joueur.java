package entity;

public abstract class Joueur {
    
    protected int equipe;
    protected int nbTireur;
    protected int nbPiegeur;
    protected int nbChar;
    
    public Joueur(int equipe){
        this.equipe=equipe;
    }
    
    public abstract int getNbTireur();
    public abstract int getNbPiegeur();
    public abstract int getNbChar();
    public abstract int choixRobot(int nbRobot);
    public abstract int choixAction();
    public abstract int directionAttaque(Robot robot);
    public abstract int directionDeplacement(Robot robot);
}