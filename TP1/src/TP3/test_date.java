package TP3;
import java.util.Scanner;
class test_date {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		madate d1 = new madate(12, 25,2022);
		madate d2 = new madate(5, 12,2022);
		madate d3 = new madate(1);

		d1.setj(5);
		d2.setm(25);
		d3.seta(50);
		d1.tostring();
		d2.tostring();
		d3.tostring();
		int j1 = d1.getj();
		int m1 = d1.getm();
		int a1 = d1.geta();
		int j2 = d2.getj();
		int m2= d2.getm();
		int a2= d2.geta();
		if(j1==j2 && m1==m2 && a1==a2) {
			System.out.println("oui");}
		else {System.out.println("non");}
		System.out.println("donne num de commande ici:");
		int k=s.nextInt();
		if(k==1) {d1.ajouterunjour();}
		if(k==2) {d1.ajouterplusieurjours(k+1);}
		if(k==3) {d1.ajouterunmoi();}
		if(k==4) {d1.ajouterunan();}
		d1.tostring();
		s.close();
		
	}
		
			
}
