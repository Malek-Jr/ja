package ex4;

public class livre {
	public  static  final  int taxx = 18;
	private String titre, auteur;
	private int nbpages;
	private double prix;
	private boolean prixfixe;
	public double getprix() {
		return this.prix;
		}
	public void setprix (double p) {
		if(prixfixe==false) {
	this.prix= p;
	this.prixfixe=true;}
		else System.out.println("tu peux pas changer le prix");}
	public livre (String auteur,String titre,int nb,double p) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbpages=nb;
		this.prix=p;
		this.prixfixe=false;
		}
	public livre (String auteur,String titre,int nb) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbpages=nb;
		this.prixfixe=false;
		}
		public livre (String auteur,String titre) {
			this.auteur = auteur;
			this.titre = titre;
			this.prixfixe=false;
			
			
			}
		
		public livre () {
			this.nbpages=0;
			this.prixfixe=false;
			}
		public livre (int nb,String titre) {
			this.nbpages = nb;
			this.titre = titre;
			this.auteur="";
			this.prixfixe=false;
			}
	public String getauteur() {
		return auteur;
		}
		public String gettitre() {
			return titre;
			}
		public int getnbpages() {
			return nbpages;
			}
	public boolean testprix()
	{if (prix !=0) {return true;  }
	else return false;
	}
	public double tax()
	{ return prix-(prix* taxx)/100;}
	
	
	
	
}
