package ex1;

public class assiettecarree extends assiette {
private double cote;
public assiettecarree(int a,int b,int x ,double c) {super(a,b,x); cote=c;}
public double getCote() {
	return cote;
}
public void setCote(double cote) {
	this.cote = cote;
}

@Override
public double calculsurface() {
	// TODO Auto-generated method stub
	return cote*cote;
}



}
