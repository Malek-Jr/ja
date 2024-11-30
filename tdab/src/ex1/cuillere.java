package ex1;

public class cuillere extends ustensile {
 private double largeur;
 public cuillere(int a,int b,int c,double l) {
	 super(a,b,c);
	 largeur=l;
	 
 }
public double getLargeur() {
	return largeur;
}
public void setLargeur(double largeur) {
	this.largeur = largeur;
}
 
}
