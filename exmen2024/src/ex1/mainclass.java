package ex1;

public class mainclass {
void readCard(int cardNo) throws RuntimeException{
System.out.println("reading card");
}
void checkCard(int cardNo) throws RuntimeException{ //ligne1
System.out.println("cheking card");
}
public static void main(String[] args) {
mainclass c=new mainclass();
int cardNo=12344;
c.readCard(cardNo); //ligne2
c.checkCard(cardNo); //ligne3
}
}
