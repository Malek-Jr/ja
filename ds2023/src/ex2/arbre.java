package ex2;

public class arbre extends plante {
   private String type_f;
   public final int absorM=22;

	public arbre(String nom, float hauteur, int age, double prix,String type) {
		super(nom, hauteur, age, prix);
		type_f=type;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getType_f() {
		return type_f;
	}

	public void setType_f(String type_f) {
		this.type_f = type_f;
	}

	public int getAbsorM() {
		return absorM;
	}

	public void description()
	{System.out.println("type: "+type_f+" : absorption :"+absorM+this.toString());}
	public double absorptionCO2() {if(this.hauteur>50)return absorM+3;
	else return absorM;}
	
	}


