package ex2;

public class resultatdistance implements Resultat {
  public double  distance;

public resultatdistance(double distance) {
	
	this.distance = distance;
}

public double getDistance() {
	return distance;
}

public void setDistance(double distance) {
	this.distance = distance;
}
public int compareTo(Resultat r)
{
  if(r instanceof resultatdistance)  {
  if(distance> ((resultatdistance)r).getDistance())return 1;
  
  if(distance< ((resultatdistance)r).getDistance())return -1;
  else return 0;}
  return 2;
}

@Override
public String toString() {
	return "resultatdistance [distance=" + distance + "]";
}

public void affiche()
{System.out.println(this.toString());
}}
