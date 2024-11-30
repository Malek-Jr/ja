package ex1;

public class agence {
	
		public voiture [] Voitures ;
		public int nbrV ;
		public int nb;
		
		
		public agence( int x) {
			nbrV=x;
			Voitures = new voiture[x];
			nb=0;
		}

		public void Ajout(voiture v) {
			if(nb<nbrV) {Voitures[nb]=v;nb++;}	
			}


		
		
		public void afficheSelection( critere c  )
		
		{
			for(int i=0;i<nb;i++)
			{
				if(c.estSatisfaitPar( Voitures [i]))
					System.out.println(   Voitures[i]);
				
			}
		}
		
}
