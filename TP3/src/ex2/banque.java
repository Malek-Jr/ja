package ex2;

public class banque {

	public static void main(String[] args) {
		compte co1=new compte();
		compte co2=new compte();
		System.out.println("num compte1:"+co1.getnum()+" solde:"+co1.getsolde());
		System.out.println("num compte1:"+co2.getnum()+" solde:"+co2.getsolde());
		co1.deposer(1200);co2.deposer(500);
		System.out.println(" solde co1:"+co1.getsolde());
		System.out.println(" solde co2:"+co2.getsolde());
		co2.transferer(700, co1);
		if(co1.getsolde()<0)System.out.println("co1 en rouge :"+(-co1.getsolde()));
		else if(co2.getsolde()<0)System.out.println("co2 en rouge :"+(-co2.getsolde()));
		else System.out.println("pas de rouge");
		
	
		
		
	}

}
