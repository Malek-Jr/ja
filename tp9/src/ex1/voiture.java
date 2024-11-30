package ex1;

public class voiture {

	private String marque;
	private String nomm;
	private int anneep;
	private double prixl;
	public voiture(String marque, String nomm, int anneep, double prixl) {
		
		this.marque = marque;
		this.nomm = nomm;
		this.anneep = anneep;
		this.prixl = prixl;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getNomm() {
		return nomm;
	}
	public void setNomm(String nomm) {
		this.nomm = nomm;
	}
	public int getAnneep() {
		return anneep;
	}
	public void setAnneep(int anneep) {
		this.anneep = anneep;
	}
	public double getPrixl() {
		return prixl;
	}
	public void setPrixl(double prixl) {
		this.prixl = prixl;
	}
	@Override
	public String toString() {
		return "voiture [marque=" + marque + ", nomm=" + nomm + ", anneep=" + anneep + ", prixl=" + prixl + "]";
	}

	
	
}
