package ex2;

public class motdico {
 public static int nb=0;
 private String mot;
 private String defi;
 public String getmot() {return mot;}
 public String getdefi() {return defi;}
 public void setdefi(String a) {defi=a;}
 public void setmot(String s) {mot=s;}
 public boolean syno(motdico m) {return this.getdefi().equals(m.getdefi());}
 
}
