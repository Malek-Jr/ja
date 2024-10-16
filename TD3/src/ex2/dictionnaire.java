package ex2;

public class dictionnaire {
public static int nbmots=0;

public motdico[] dico;
public String nom;
public dictionnaire(String ch){dico=new motdico[20];nom=ch;}
public void ajoutermot(motdico m) {if(dictionnaire.nbmots<20) {dico[nbmots]=new motdico();dico[nbmots].setdefi(m.getdefi());dico[nbmots].setmot(m.getmot());dictionnaire.nbmots++;}}
public void supprimermot(String ch) {for(int i=0;i<nbmots;i++) {
	if(dico[i].getmot().equals(ch)) {for(int j=i;j<nbmots-1;j++)dico[j]=dico[j+1];} nbmots--;}
}
public int chercher(String ch) {for(int i=0;i<nbmots;i++) {if(dico[i].getmot().equals(ch))return i;}
return -1;}
public void lister() {for(int i=0;i<nbmots;i++)System.out.println(dico[i].getmot()+":"+dico[i].getdefi());}
public int nbsyn(motdico m) {
	int k=0;
	for(int i=0;i<nbmots;i++)
	{if(dico[i].syno(m)) k++;}
	return k-1;
}

}
