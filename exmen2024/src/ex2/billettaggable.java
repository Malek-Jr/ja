package ex2;

import java.time.LocalDate;
import java.util.Arrays;

public class billettaggable extends billet implements taggable {
private String[] ltags;
private int nbtags;
public billettaggable(LocalDate datepub, String auteur, int cap) {
	super(datepub, auteur);
	
	ltags=new String[cap];
}

public String toString() {
	return "billettaggable [ltags=" + Arrays.toString(ltags) + ", nbtags=" + nbtags + ", datepub=" + datepub
			+ ", auteur=" + auteur + ", toString()=" + super.toString() + "]";
}
public void ajoutTag(String tag) {
	
	if(nbtags<ltags.length) {
		for(int i=0;i<nbtags;i++)
			if(ltags[i].equals(tag)) {
				System.out.println("you can't!");
		        return;}
		ltags[nbtags+1]=tag;
		nbtags++;
		
		
	}
	
}
public void supprimeTag(String tag) {
	for(int i=0;i<nbtags;i++) {
		if(ltags[i].equals(tag)) {
			for(int j=i;j<nbtags-1;j++)
				ltags[j]=ltags[j+1];
		nbtags--;
		return;
	
}
}
	System.out.println("nexiste pas!");
}

public int nombreTags()
{
	return nbtags;
}
public int rechercheTag(String tag ) {
	for(int i=0;i<nbtags;i++) {
		if(ltags[i].equals(tag)) 
			return i;
		
}
	return -1;}










}
