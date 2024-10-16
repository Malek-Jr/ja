package ex1;
import java.util.Arrays;
import java.util.Scanner;
public class calculmoyenne {

	public static void main(String[] args) {
		
		Scanner h = new Scanner(System.in);
     int k=h.nextInt();
     
     while(k>tab.nmax) {
    	 
    	 k=h.nextInt();
	}
     
     float[] notectrl=new float[k];float []noteexam=new float [k];
     
     tab.remplir(noteexam);tab.remplir(notectrl);
     System.out.println("noteexam-----------------");
     tab.lister(noteexam);
     System.out.println("notectrl-----------------");
     tab.lister(notectrl);
     noteexam=Arrays.copyOf(tab.additionner(1.5f, noteexam), k);
     float []moy=new float[k];
     moy=Arrays.copyOf(tab.additionner(notectrl, tab.produit(2, noteexam)), k);
     moy=Arrays.copyOf(tab.div(moy,3),k);
     System.out.println("moy-----------------");
     tab.lister(moy);
     System.out.println("moyenne de la classe="+tab.somme(moy)/k);
     h.close();
     
	}

}
