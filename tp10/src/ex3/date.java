package ex3;
import java.util.Scanner;
public class date {
int j;int m;int a;
public date() {


Scanner s = new Scanner(System.in);
int jj=s.nextInt();
int mm=s.nextInt();
int aa=s.nextInt();
try {
	if(jj<1|| jj>12 )
		throw new problemexception("jour pas correct !");
	if(mm<1|| mm>31)
		throw new problemexception("mois pas correct!");
	j=jj;
	m=mm;
	a=aa;
	System.out.println(jj+"/"+mm+"/"+aa);
}
catch(problemexception p)
{System.out.println(p.ch);}
}}