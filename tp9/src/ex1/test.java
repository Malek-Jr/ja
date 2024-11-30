package ex1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   agence a=new agence(10);
   voiture v1=new voiture("a","n",5,10);
   voiture v2=new voiture("dede","nc",47,111);
   voiture v3=new voiture("Clio","dzz",52,75);
   a.Ajout(v1); a.Ajout(v2); a.Ajout(v3);
   critereprix cp=new critereprix(100);
   criteremarque cm=new criteremarque("Clio");
   
   a.afficheSelection(cm);
   a.afficheSelection(cp);
	}

}
