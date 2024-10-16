package ex2;
import java.util.Scanner;
public class film {
 protected String titre;
 protected String real;
 protected String pays;
 protected int duree;
 protected int nb;
 
public static int nbtot=0;
 public int getnb() {return nb;}
 public void setnb(int a) {nb=a;}
 public String toString1() {return titre+" de "+real+" ("+pays+") - "+duree +"min";}
 public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getReal() {
	return real;
}
public void setReal(String real) {
	this.real = real;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public int getNb() {
	return nb;
}
public void setNb(int nb) {
	this.nb = nb;
}
public static int getNbtot() {
	return nbtot;
}
public static void setNbtot(int nbtot) {
	film.nbtot = nbtot;
}
public film(String tit,String r,String pa,int d,int k) {titre=tit;real=r;pays=pa;duree=d;nb=k;}
 public float total1() {
	 Scanner s=new Scanner(System.in);
	 int k=s.nextInt();
	 while (k>nb)
		 k=s.nextInt();
	 int t=2*k+(nb-k)*3;
	 return t;
	 
	 
	 
	 
 }

	
 
 
 
}
