package ex2;

public class pepiniere {
    public final int maxp=1000;
    public plante inventaire[];
    public static int nbplantes=0;
	public pepiniere() {
		
		inventaire = new plante[maxp];
		
	}
	public void ajoutplante(plante p) {
		if(nbplantes<maxp) {inventaire[nbplantes]=p;nbplantes++;}
		else System.out.println("you can't");
	}
		 public void afficherinventaire() {
		        for (int i=0;i<nbplantes;i++){
		            
		            if (inventaire[i]instanceof fleur) {
		            	((fleur)inventaire[i]).description();
		                ((fleur)inventaire[i]).fleurir();}
		            if (inventaire[i]instanceof arbre) {
		            	((arbre)inventaire[i]).description();
		                System.out.println("Type feuillage: "+((arbre)inventaire[i]).getType_f());}
		            
		        }
		    }

		    
		    public double totalabsorptionCO2() {
		        double tot=0;
		       for(int i=0;i<nbplantes;i++) {
		            if (inventaire[i]instanceof arbre) 
		                tot+=((arbre)inventaire[i]).absorptionCO2();
		           
		        }
		        return tot;
		    }
		    public int comptercaduques() {
		        int c=0;
		      for(int i=0;i<nbplantes; i++) {
		            if(inventaire[i]instanceof arbre) {
		                arbre a=(arbre)inventaire[i];
		                if (a.getType_f().equals("Caduque"))c++; 
		            }
		        }
		        return c;
		    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
               System.out.println("        Pépinière GREEN HANDS");
               pepiniere pépinière = new pepiniere();
               fleur rose = new fleur(null, 30, 12, 15.99, "Rouge", 2);
               fleur tulipe = new fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
               arbre chêne = new arbre("Chêne", 200, 60, 89.99, "Caduque");
               arbre sapin = new arbre("Sapin", 150, 30, 59.99, "Persistant");
               rose.setNom("Rose");
               System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur());
               pépinière.ajoutplante(rose);
               pépinière.ajoutplante(tulipe);
               pépinière.ajoutplante(chêne);
               pépinière.ajoutplante(sapin);
               pépinière.afficherinventaire();
               System.out.println("Total Aborption CO2        "+   pépinière.totalabsorptionCO2());
               System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pépinière.comptercaduques());
              
           }
	}
	


