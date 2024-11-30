package ex1;

public class assietteronde extends assiette {
private double rayon;
public assietteronde(int a,int b,int x ,double r) {super(a,b,x);rayon =r;}
public double getRayon() {
	return rayon;
}
public void setRayon(double rayon) {
	this.rayon = rayon;
}

@Override
public double calculsurface() {
	// TODO Auto-generated method stub
	return 3.14*rayon*rayon;
}


}
