package ex2;

public class fleur extends plante {
private String couleur;
private int moisF;

	public fleur(String nom, float hauteur, int age, double prix,String c,int m) {
		super(nom, hauteur, age, prix);
		couleur=c;
		moisF=m;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getMoisF() {
		return moisF;
	}

	public void setMoisF(int moisF) {
		this.moisF = moisF;
	}

	public void description()
	{System.out.println("couleur: "+couleur+" : moisF :"+moisF+this.toString());}
	public void fleurir() {if(moisF==4 || moisF==5 ||moisF==6)System.out.println("en fleurs");
	else System.out.println("pas en fleurs");}
	
	}


