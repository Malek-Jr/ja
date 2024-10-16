package TP2;

class Point {

	private String nom;
	private int abs;
	private int ord;

	public Point(String c, int x, int y) {
		nom = c;
		abs = x;
		ord = y;
	}

	public Point(String c) {
		nom = c;

	}

	public Point(int x, int y) {
		ord = y;
		abs = x;
	}

	public void Affiche() {
		System.out.println(nom + "(" + abs + "," + ord + ")");
	}

	public void transhoriz(int a) {
		abs += a;
	}

	public void transvert(int a) {
		ord += a;
	}

	public void trans(int a, int b) {
		ord += b;
		abs += a;
	}

	public boolean Coincide(Point p) {

		return (this.abs == p.abs && this.ord == p.ord);
	}

	public String getNom() {
		return this.nom;
	}

	public int getAbs() {
		return this.abs;
	}

	public int getOrd() {
		return this.ord;
	}

	public void setAbs(int a) {
		this.abs = a;
	}

	public void setNom(String a) {
		this.nom = a;
	}

	public void setOrd(int a) {
		this.ord = a;
	}

}
