package TP1;

class Point {
	private char id;
	private double abs;

	public Point(char c, double x) {
		id = c;
		abs = x;
	}

	public void affiche() {
		System.out.println("point " + id + " abs " + abs);
	}

	public void translate(double dx) {
		abs += dx;
	}
}
