package javatest;

import java.util.Scanner;

public class Switch {
	
	
	//主程式進入點
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter month :");
		switch(s.nextInt()){

		case 1://若變數為1，case只可檢視數值或字元

			System.out.println("31天");
			break;//注意，沒寫break的話他會從符合的那個開始繼續做下去！
			//可以試試看輸入大月份跟小月分的差異，因為小月份故意沒放break，所以會顯示數字很多次

		case 3:
			System.out.println("31天");
			break;

		case 5:
			System.out.println("31天");
			break;

		case 7:
			System.out.println("31天");
			break;

		case 9:
			System.out.println("30天");
			break;

		}
	}

}
