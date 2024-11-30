package ex2;

public class factorielle {
	

	 public static void main (String[] args) 
	{
	int i, nbEntiers=0, factorielle=1; int ancien;
	try {
		if(args.length==0)throw new problemexception(1);
	nbEntiers= Integer.parseInt(args[0]);

	if(nbEntiers<0  )
		throw new problemexception();

	 
	
		
	for (i=2;i<= nbEntiers;i++)
	{
	ancien=factorielle; factorielle *= i;
	}
	System.out.println(" Voila la factorielle des"+ nbEntiers +
	" premiers entiers : "+ factorielle );}

catch(problemexception e ) {
	
	System.out.println(e.getMessage());
	}

catch(NumberFormatException v ) {
	System.out.println("doit etre entiere!"+v.getMessage());
}
	
}}
	

