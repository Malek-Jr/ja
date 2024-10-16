package ex2;

public class jcc {
    public static int nbm=30;
	public film []com;
	public int ann;
	public static int nbf=0;
	public jcc(int ann,int h ) {
	if(h<nbm) {
	this.ann=ann;com=new film[h];}}
	public void ajoutfilm(film f) {
		if(jcc.nbf>nbm) System.out.println("non");
		else {this.com[nbf]=f;
		jcc.nbf++;
		film.nbtot++;
		}
	}
	public void listefilmjcc() {for(int i=0;i<com.length;i++) {System.out.println(com[i].toString1()) ;}}
	public float totaljcc() {float k=0;for(int i=0;i<com.length;i++) {
			k+=com[i].total1();}
	return k;}
	
	public static void main(String[] args) {
		
		
		jcc ob=new jcc(2021,2);
		doc f1=new doc("guerre","dernier","ousman","mali",86,30);
		doc f2=new doc("","insu","jilani","tunisie",105,45);
		ob.ajoutfilm(f2);ob.ajoutfilm(f1);
		ob.listefilmjcc();
		System.out.println(ob.totaljcc());
		System.out.println("nb totale film:"+film.nbtot);
	}
		
		
				
				
				

	

}
