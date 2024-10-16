package ex2;

public class test {

	public static void main(String[] args) {
		dictionnaire d=new dictionnaire("larousse");
		motdico m1=new motdico();
		motdico m2=new motdico();
      m1.setdefi("aa");m1.setmot("a");m2.setdefi("aa");m2.setmot("b");
      d.ajoutermot(m2);d.ajoutermot(m1);
      d.lister();
      int h=d.chercher("rr");int o=d.chercher("a");
      if(h==-1)System.out.println("nexiste pas");
      if(o!=-1)System.out.println(d.dico[o].getmot()+":"+d.dico[o].getdefi());
      int f=d.nbsyn(m1);System.out.println("nb syno:"+f);
      d.supprimermot(m1.getdefi());
      System.out.println("apres suppression:");     d.lister();
      
	}

}
