package ex2;

import java.time.LocalDate;

public class message extends billet {
private String contenu;

public message(LocalDate datepub, String auteur, String contenu) {
	super(datepub, auteur);
	this.contenu = contenu;
}

public String getContenu() {
	return contenu;
}

public void setContenu(String contenu) {
	this.contenu = contenu;
}

}
