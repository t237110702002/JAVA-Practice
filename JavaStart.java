package javatest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;





public class JavaStart {


	/* 主程式進入點
	 * 必須為靜態的，這樣JVM才可以調用它而無需實例化它的類
	 */
	public static void main(String args[]){
		
		


		System.out.println("hi java");


		//Map應用
		Map<String,Object> map = new HashMap<>();
		map.put("name", "Eric");
		map.put("age", 24);
		map.put("male", true);
		System.out.println("map: " + map);


		Object n = map.get("name");
		System.out.println("map name : " + n);

		System.out.println("map size : " + map.size());
		System.out.println("map empty? : " + map.isEmpty());


		//取得時間
		Calendar calendar = Calendar.getInstance(Locale.TAIWAN);
		Date currentDate = calendar.getTime();
		System.out.println("current Date : "+currentDate);

		//設定日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDateS = sdf.format(currentDate);
		System.out.println("current Date : "+currentDateS);


		//矩陣
		//int [] array = new int[5];
		int[] array = new int[] {90, 85, 55, 94, 77};
		String[] arrayS = new String[] {"hi","hello"};

		System.out.println("array : "+array);
		System.out.println("array[2] : "+array[2]);
		System.out.println("arrayS : "+arrayS.length);

		
		/* equals跟＝＝的差別
		 * equals ->比較物件裡的值(屬性)
		 * == ->比較物件(實體及記憶體空間)
		 */
		
		String a = "Tina";
		String b = new String("Tina");

		System.out.println("a==Tina  :"+(a=="Tina"));
		System.out.println("a.equals(\"Tina\")  :"+a.equals("Tina"));	
		System.out.println("b==Tina  :"+(b=="Tina"));
		System.out.println("b.equals(\"Tina\")  :"+b.equals("Tina"));	





		int x = 5, y = 6;
		String a1 = (x>y) ? "yes" : "no";
		System.out.println(a1);


	}



}
