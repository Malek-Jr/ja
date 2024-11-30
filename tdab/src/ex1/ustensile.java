package ex1;
import java.util.Date;

public abstract class ustensile {
	protected Date annee;
	
	public ustensile(int a,int b ,int c) {
		annee=new Date(a,b,c);
	
		
		
		
	}

	public double calculvaleur() {
	double k=0;
	
		if(2019-(annee.getYear())>50) {
			if(this instanceof assiettecarree)
			k=(2019-(annee.getYear())-50)*5;
		
		else k=2019-(annee.getYear())-50;
		System.out.println(annee.getYear());}
		
	return k;}
	
	
	
	
	

}
