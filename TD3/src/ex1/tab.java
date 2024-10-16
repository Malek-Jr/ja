package ex1;
import java.util.Scanner;
public class tab {
public static int nmax=40;
public static Scanner s = new Scanner(System.in);
public static void remplir(float t[]) {
	for(int i=0;i<t.length;i++) 
t[i]=s.nextFloat();
	
}

public static float somme(float t[]) {
	int k=0;for(int i=0;i<t.length;i++)k+=t[i]; return k;}
public static float[] additionner(float t1[],float t2[]) {
	float[] t=new float[40];for(int i=0;i<t1.length;i++) t[i]=t1[i]+t2[i]; return t;
	
}
public static float[] produit(float x,float t[]) {float [] v=new float[40];for(int i=0;i<t.length;i++) v[i]=t[i]*x; return v;}
public static float[] div(float t [],float x) {for(int i=0;i<t.length;i++)t[i]=t[i]/3; return t;}
public static void lister(float t[]) {for (int i=0;i<t.length;i++) {System.out.println(t[i]);}}
public static float[] additionner(float x,float t[]) {
	for(int i=0;i<t.length;i++)
		t[i]+=x;
	return t;
	
	
	
}
}
