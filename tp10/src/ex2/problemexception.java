package ex2;

public class problemexception extends Exception {
	int a;
	public problemexception() {}
	public problemexception(int a) {a=a;}
public String getMessage() {
if (a==1)
return "nb negatif!";
else return "pas darguments!";

}
}