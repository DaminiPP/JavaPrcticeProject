package JavaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {
		
		int a =30;
		int b= 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than a");
		}
		
		int c=40;
		int d=40;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a logic to find highest number
		
		int a1=300;
		int b1=400;
		int c1=500;
		
		//nested if else
		
		if(a1>b1 && a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
	}

}
