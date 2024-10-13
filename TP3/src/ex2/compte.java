package ex2;

public class compte {
	
private int num;
private float solde;
public static int c=0;
public compte() {c++;num=c;solde=0; }

public int getnum()
{return this.num;}
public float getsolde()
{return this.solde;}


public void deposer(float m) { this.solde+=m;}
public void retirer(float m) { this.solde-=m;}
public float avoirsolde() { return this .solde;}

public void transferer(float m,compte cc) {

 cc.solde+=m;this.solde-=m;
}



}
