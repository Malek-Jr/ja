package ex2;

public class epreuve  {
private String domi;
private int max;
private athlethe []t;
private int nbe;
private boolean etat;

public epreuve(String d,int m)
{domi=d;max=m;
t=new athlethe[max];
nbe=0;etat=false;
}
public String toStringg()
{
	String k="";
	for(int i=0;i<nbe;i++) 
		k+=t[i].getNom()+" ";
	return k;}

public String toString()
{
	return domi+etat+this.toStringg();}
public String getdomi()
{return domi;}

public void ajoutathlethe(athlethe a)
{
if(nbe<max)
{t[nbe]=a;nbe++;}}

public void terminer()
{
	etat=true;
}
public boolean estterminee()
{return etat;}
public Resultat getrecordolympique()
{
	Resultat re=t[0].getResultat();
	
	for(int i=1;i<nbe;i++) {
		if(t[i].getResultat().compareTo(re)==1)re=t[i].getResultat();
	}
	return re;
		
}
	
public String getVinquer()
{
Resultat k = null;
if (etat==true) k=this.getrecordolympique();

for(int i=0;i<nbe;i++) {if(t[i].getResultat().compareTo(k)==0) return t[i].getNom();}
	return null;}
public void fixeresultat(int id,Resultat r)  {
try{if(etat)	
    throw new IllegalStateException();

	for(int i=0;i<nbe;i++) {
		if(t[i].getId()==id) { t[i].setResultat(r);break;}
		}
	
}
	

catch(IllegalStateException e)
{e.notifier();}
}
	
		
	
public Resultat getResultat(int id)
{

	for(int i=0;i<nbe;i++) {
		if(t[i].getId()==id &&t[i].getResultat()!=null) return t[i].getResultat();}
	return null;}
	


}









