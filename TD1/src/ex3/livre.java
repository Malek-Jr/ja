package ex3;

	class livre {
		private String titre, auteur;
		private int nbpages;
		public livre (String auteur,String titre,int nb) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbpages=nb;
		}
		public livre (String auteur,String titre) {
			this.auteur = auteur;
			this.titre = titre;
			
			
			}
		
		public livre () {
			this.nbpages=0;
			}
		public livre (int nb,String titre) {
			this.nbpages = nb;
			this.titre = titre;
			this.auteur="";
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
		public void setnbpages (int nb) {
		if(nb>20)
		{nbpages = nb;}
		else { System.out.println("nb est inf a 20");}
		}
		public void setauteur (String ch) {
			auteur = ch;
			}
		public void settitre (String chk) {
			titre = chk;
			}
		public String toString()
		{
			return "livre intitulé "+auteur+" contenant "+nbpages+" pages.";
		}
		public void decrire ()
		{System.out.println(toString());}
		
		

}
