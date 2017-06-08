package javatest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {

    public static void main(String[] args) throws IOException { 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 

        System.out.print("請輸入一列文字，可包括空白: "); 
        String text = bufferedReader.readLine(); 
        System.out.println("輸入的文字: " + text); 
    } 
	
}
