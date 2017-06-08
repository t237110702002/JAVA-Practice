package javatest;

public class From {
	
	 public static void main(String[] args) {
	        Hometown hometown = new Hometown();//Hometown是類別(class) hometown是物件(object)
	        System.out.print("名字: " + hometown.getPerson()); 
	        System.out.println("  家鄉: " + hometown.getPlace()); 

	        hometown = new Hometown("艾瑞克", "南投");
	
	        System.out.print("名字: " + hometown.getPerson()); 
	        System.out.println("  家鄉: " + hometown.getPlace()); 
	    } 

}
