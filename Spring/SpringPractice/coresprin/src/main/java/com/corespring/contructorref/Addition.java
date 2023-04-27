package com.corespring.contructorref;

public class Addition {
	private int a;
	private int b;
	
	Addition(int a , int b) {
		System.out.println("Constructor : int , int ");
		this.a = a;
		this.b = b;
	}
	
	Addition(double a , double b) {
		System.out.println("Constructor : duoble , double ");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	Addition(String a , String b) {
		System.out.println("Constructor : String , String ");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	void sumAdds() {
		System.out.println("Sum is : "+(this.a+this.b));
	}
	
	
}
