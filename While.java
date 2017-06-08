package javatest;

import java.util.Scanner;
//顯示出金字塔
public class While {
	
	
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter the number :");
	while(s.hasNext()){
		int r = s.nextInt();
		if(r==99)
			break;
		
		for (int i = 0; i< r; i++){

			for (int k = r; k>i+1; k--){
				System.out.print("o");
			}

			for(int j = 0; j<i+1; j++){
				System.out.print("*o");
			}

			System.out.println("");
		}
		System.out.print("Please enter again :");
	}
	}

}
