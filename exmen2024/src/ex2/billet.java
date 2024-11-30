package ex2;
import java.time.LocalDate;
public class billet implements publiable {
protected LocalDate datepub;
protected String auteur;
public billet(LocalDate datepub, String auteur) {
	super();
	this.datepub = datepub;
	this.auteur = auteur;
}
@Override
public String toString() {
	return "billet [datepub=" + datepub + ", auteur=" + auteur + "]";
}
public LocalDate getDatePublication()
{return datepub;}
public String getAuteur()
{return auteur;}


}
