package TP3;

class madate {

	private int jour ;
	private int mois ;
	private int annee ;
	public madate (int a, int b,int c) { 
		jour = a ;
		mois = b ;
		annee = c;
		}
	public madate (int a) { 
		annee = a ;
		jour =1;
		mois =1;}
	    
	public int getj()
    {return  jour;}
    public int getm()
    {return  mois;}
    public int geta()
    {return  annee;}
    public void setj(int a)
    {jour=a;}
    public void setm(int a)
    {mois=a;}
    public void seta(int a)
    {annee=a;}
    public void tostring ()
	{ System.out.println(jour+"/"+mois+"/"+annee);}
    public void ajouterunjour ()
	{ if(jour==30 && mois ==12)
		{jour=1;
		mois=1;
		annee++;}
		
	else if(jour ==30 && mois !=12)
	{jour++;
    mois++;
    }
	else {jour++ ;}}
	public void ajouterplusieurjours (int n) {
		for(int i=0;i<n;i++) 
		{
			ajouterunjour();}
		}
	public void ajouterunmoi () {
		if(mois==12) {mois=1;}
		else  {mois++;}}
	public void ajouterunan () {
			annee++;}
		
}	
			
	

