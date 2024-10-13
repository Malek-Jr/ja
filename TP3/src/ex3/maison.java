package ex3;

public class maison {
	private String type;
	private String adresse;
	private int nb;
	private float surf;
	public maison(String adr, String t, int n) {adresse=adr;type=t;nb=n;}
	public maison(String a, String t, float s,int n) {adresse=a;type=t;nb=n;;surf=s;}
	public void setsurface(float s) {this.surf=s;}
	public float prix(float p) {return this.surf*p;}
	public float prix() {return 2100*this.surf;}
	public String tochaine() {return this.type+" de "+this.surf+" m2 à "+this.adresse+" avec "+this.nb+" chambres";}
	public static void main(String[] args) {
		maison m1=new maison("Tunis","duplex",210,4);
		maison m2=new maison("Nabeul","villa",5);
		System.out.println(m1.tochaine());
		System.out.println(m2.tochaine());
        m2.setsurface(230);
        System.out.println("prix m1 methode 1:"+m1.prix());
        System.out.println("prix m1 methode 2:"+m1.prix(2100));
        System.out.println("prix m2 methode 1:"+m2.prix());
        System.out.println("prix m2 methode 2:"+m2.prix(2100));
	}
	
	
		

}
