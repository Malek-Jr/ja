package ex2;

public class resultatrang implements Resultat {
private int rang;

public resultatrang(int rang) {
	super();
	this.rang = rang;
}

public int getRang() {
	return rang;
}

public void setRang(int rang) {
	this.rang = rang;
}

public int compareTo(Resultat r) {

if(r instanceof resultatrang)  {
	  if(rang> ((resultatrang)r).getRang()) return -1;
	  if(rang< ((resultatrang)r).getRang()) return 1;
	  else return 0;}
return rang;}
@Override
public String toString() {
	return "resultatrang [rang=" + rang + "]";
}

public void affiche()
{System.out.println(this.toString());
}}

