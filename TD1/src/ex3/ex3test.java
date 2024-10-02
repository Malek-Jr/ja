package ex3;

public class ex3test {

	public static void main(String[] args) {
		
		livre T1=new livre("coelho","l'archimiste",255);
		livre T2=new livre(508,"la Tunisie");
		livre T3=new livre("jk rowiling","harry potter");
		livre V[]=new livre[3];
		V[0]=T1;V[1]=T2;V[2]=T3;
		for(int i=0;i<3;i++)
		{
			System.out.println(V[i].gettitre()+" "+V[i].getauteur()+" "+V[i].getnbpages());
		}
		V[0].setauteur("paulo coelho");
		V[2].setnbpages(461);
		for(int j=0;j<3;j++)
		{V[j].decrire();}
		
		// TODO Auto-generated method stub

	}}


