package ex1;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ustensile[] us = new ustensile[5];
		us[0] = new assietteronde(1926,11,5,8.4);
		us[1] = new cuillere(1881,11,5,7.3);
		us[2] = new assiettecarree(1935,11,5,5.6);
		us[3] = new cuillere(1917,11,1,8.8);
		us[4] = new assietteronde(1837,11,5,5.4);

		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
	}

		
	static void afficherCuilleres(ustensile[] us) { int nbCuilleres = 0;
		for (int i = 0; i< us.length; i++) 
			
			{ 
				
				if(us[i] instanceof cuillere) nbCuilleres++;
				
			}
		
		System.out.println("Il y a " + nbCuilleres + " cuillères.");
		}
	static void afficherSurfaceAssiettes(ustensile[] us)
	{
		double tot=0;
		for(int i=0;i<us.length;i++)
		{if(us[i] instanceof assiette) tot+=((assiette)us[i]).calculsurface();}
		System.out.println("tot="+tot);
		}
	static void afficherValeurTotale(ustensile[] us) {
		double k=0;
		for(int i=0;i<us.length;i++)
		{
			k+=us[i].calculvaleur();
		}
		System.out.println("tot en dinars:"+k);}
			
			
			
		
	
	
	
	

}
	


