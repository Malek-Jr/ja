package ex1;


	class A {
	    void m(A a) { System.out.println("m de A");  }
	    void m(B b) { System.out.println("m de A version 2"); }
	    void n(A a) { System.out.println("n de A"); }
	}

	class B extends A {
	    void m(A a) { System.out.println("m de B"); }
	    void n(B b) { System.out.println("n de B"); }
	

	
	    public static void main(String[] args) {
	        A a = new B();
	        B b = new B();
	        A a1 = new A();

	        a.m(b);
	        a.n(b);
	        b.m(b);
	        b.n(b);
	        a.m(a1);
	        a.n(a1);
	        a1.m(b);
	        a1.n(b);
	       
	    }}
	

