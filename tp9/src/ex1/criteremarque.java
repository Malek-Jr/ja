package ex1;

public class criteremarque implements critere  {
 private String marquer;

public criteremarque(String marquer) {
	
	this.marquer = marquer;
}

public String getMarquer() {
	return marquer;
}

public void setMarquer(String marquer) {
	this.marquer = marquer;
}
public boolean estSatisfaitPar(voiture v)
{
	return this.getMarquer().equals(v.getMarque());
	
}
 
}
