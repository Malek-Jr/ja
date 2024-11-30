package ex2;

public class blog {
public String titre;
public publiable[] lbillets;
public int nbbillets;
public blog(String titre,  int cap) {
	
	this.titre = titre;
	lbillets=new publiable[cap];
}
public void post(publiable billet) { 
try
{if(nbbillets<lbillets.length) {
	if(billet instanceof image) {
	
	
	if(((image)billet).getUrl().startsWith("HTTPS")) {
		lbillets[nbbillets+1]=billet;
		nbbillets++;
		
	}
	else throw new InvalidURLException("pas sécurisé!");
	
}
	if(billet instanceof video) {
		
		
		if(((image)billet).getUrl().startsWith("HTTPS")) {
			lbillets[nbbillets+1]=billet;
			nbbillets++;
			
		}
		else throw new InvalidURLException("pas sécurisé!");
	}}

else System.out.println("max atteint!") ;   }
catch(InvalidURLException e)
{
	e.getmessage();
}





}

public int getnombrebilletstaggables()
{
	return nbbillets;
}
public publiable[] RechercheBilletsTaggablesParAuteur(String auteur) {
	publiable[]t=new publiable[nbbillets];
	int a=0;
	for(int i=0;i<lbillets.length;i++) {
		if(lbillets[i].getAuteur().equals(auteur))   {
			t[a]=lbillets[i];
			
		}
	
	}
	return t;
	
	
}
public publiable getPlusRécentBillet() {
	publiable rec=lbillets[0];
	for(int i=1;i<nbbillets;i++)
	{
		if(lbillets[i].getDatePublication().isAfter(rec.getDatePublication())==false)
			rec=lbillets[i];
		
	}
	return rec;
}
public publiable[] RechercheBilletsParContenu(String[] mots){
	publiable[] v=new publiable[nbbillets];
	int c=0;
	for(int i=0;i<nbbillets;i++)
	{ int h=0;
		String k=((message)lbillets[i]).getContenu();
		for(int j=0;j<mots.length;j++) {
			if(k.indexOf(mots[j])!=-1)h++;
				
		}
		if(h==mots.length) {
			v[c]=lbillets[i];
			c++;
		}
	}
	return v;
}








}





