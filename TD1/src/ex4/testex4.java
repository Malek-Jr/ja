package ex4;



public class testex4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		livre T1=new livre("coelho","l'archimiste",255,45);
		livre T2=new livre("agav","bhhg",400,87);
		livre T3=new livre("dede","ghgh",144,5);
		livre V[]=new livre[3];
		V[0]=T1;V[1]=T2;V[2]=T3;
		for(int i=0;i<3;i++)
		{
			System.out.println(V[i].gettitre()+" "+V[i].getauteur()+" "+V[i].getnbpages()+" "+V[i].getprix());
		}
		V[0].setprix(10);
		for(int i=0;i<3;i++)
		{
			System.out.println(V[i].gettitre()+" "+V[i].getauteur()+" "+V[i].getnbpages()+" "+V[i].getprix());
		}
		V[0].setprix(5);
		System.out.println("prix apres tax des livres:");
		for(int i=0;i<3;i++)
		{
			System.out.println(V[i].gettitre()+" "+V[i].getauteur()+" "+V[i].getnbpages()+" "+V[i].tax());
		}
		System.out.println("tous les auteurs :");
		for(int i=0;i<3;i++)
		{
			System.out.println(i+1+":"+V[i].getauteur()+" ");
		}
		
		
	}

}