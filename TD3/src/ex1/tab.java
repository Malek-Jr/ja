package ex1;
import java.util.Scanner;
public class tab {
private static int nmax=40;
public static void remplir(float t[]) {
	Scanner s = new Scanner(System.in);for(int i=0;i<4;i++) 
t[i]=s.nextInt();
	
}
public static float somme(float t[]) {
	int k=0;for(int i=0;i<t.length;i++)k+=t[i]; return k;}
public static float[] additionner(float t1[],float t2[]) {
	float t[];for(int i=0;i<t1.length;i++) t[i]=t1[i]+t2[i]; return t;
	
}
public static float[] produit(float x,float t[]) {float v[];for(int i=0;i<t.length;i++) v[i]=t[i]*x; return v;}
public static void lister(float t[]) {for (int i=0;i<t.length;i++)System.out.println(t[i]);}

}
}