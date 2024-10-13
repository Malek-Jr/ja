package ex1;

public class entier {
	

	public static int com=0;
	
	
	public static int factoriel(int n) {
		int k=1;
		for(int i=2;i<=n;i++)
			k*=i;
		return k;
		}
	public static int absolu(int n) {
		if(n<=0)
			return -n;
		else return n;	
	}
	public static void compare(int e1,int e2) {
		if(e1<e2) System.out.println(e1+"inférieur à"+e2);
		else if(e1>e2) System.out.println(e1+"supérieur à"+e2);
		else System.out.println(e1+"égale"+e2);
	}
	public static void premier(int n) {
		int h=0;
	
		for(int i=2;i<=Math.sqrt(n);i++)
		{if(n % i==0) h++;
	}
		if(h==0) System.out.println("nb" +n+" est premier");
		else System.out.println("nb" +n+"non premier");}
	
	
		
		

}
