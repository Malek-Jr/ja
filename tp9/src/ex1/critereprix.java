package ex1;




	public class critereprix implements critere  {
	 private double prix;

	public critereprix(double p) {
		
		this.prix = p;
	}

	public double getPrix() {
		return prix;
	}

	public void setprix(double p) {
		this.prix = p;
	}
	public boolean estSatisfaitPar(voiture v)
	{
		return this.getPrix()<(v.getPrixl());
		
	}
	 
	}


