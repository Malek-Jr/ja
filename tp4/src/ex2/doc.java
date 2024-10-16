package ex2;

public class doc extends film {
	private String sujet;
	public static float tarif=2;
public doc(String ch,String tit, String r, String pa, int d,int k) {	
	super(tit, r, pa, d,k);
	this.sujet=ch;

	}
public String toString() {
return this.toString1()+":"+sujet; }
 public float total() { return nb*tarif;}
 
} 

