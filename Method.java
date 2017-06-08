package javatest;



public class Method {
	public static void main(String args[]){
		

		int a = 5, b = 3, sum;
		
		sum = doSum(a,b);
		
		System.out.println("sum : "+sum);

		
	}

	//doSum是一個method
	public static int doSum(int a, int b){
		int s;
		s = a+b;
		return s;
	}
	
}
