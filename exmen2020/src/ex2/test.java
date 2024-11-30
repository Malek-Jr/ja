package ex2;

public class test {
    public static void main(String[] args) {
       
        epreuve e=new epreuve("saut",4);
        athlethe a1=new athlethe(1,"a");
        athlethe a2=new athlethe(2,"b");
        athlethe a3=new athlethe(3,"c");
        athlethe a4=new athlethe(4,"d");
        e.ajoutathlethe(a1);
        e.ajoutathlethe(a2);
        e.ajoutathlethe(a3);
        e.ajoutathlethe(a4);
        System.out.println("État initial de l'épreuve : " + e);
        e.fixeresultat(1,new resultatdistance(7)); 
        e.fixeresultat(2,new resultatdistance(8)); 
        e.fixeresultat(3,new resultatdistance(4.2)); 
        e.fixeresultat(4,new resultatdistance(9.2)); 
        System.out.println("resultat 1:"+e.getResultat(1));
        System.out.println("resultat 2:"+ e.getResultat(2));
        System.out.println("resultat 3:"+ e.getResultat(3));
        System.out.println("resultat 4:"+ e.getResultat(4));
        Resultat rec=e.getrecordolympique();
        System.out.println("record:"+rec);
        e.terminer();
        System.out.println("après fin "+e.getdomi());
        String v=e.getVinquer();
        System.out.println("vainqueur:"+v);
        e.fixeresultat(1,new resultatdistance(5));
        
    }
}
