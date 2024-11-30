package ex2;

public class InvalidURLException extends Exception {
	public String a;
public InvalidURLException(String a) {
a=a;

}
public void getmessage() {
	
	
	System.out.println(a);
}

}
