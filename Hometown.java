package javatest;
//類別比較算是一個範本，裡面定義好該有的屬性(和方法，其中方法又大概可以分為一般的方法、類別方法和建構子。)
public class Hometown {

	/* 類別中的屬性都應該進行封裝 (encapsulation) 。
	 * 所謂的封裝就是利用存取權限修飾詞 (access level modifier) 
	 * 指定屬性及方法的存取權限，利用特定的 getter 及 setter 方法才能存取屬性。
	 * 一般來說會把屬性宣告為 private ，然後把存取屬性的 getter 及 setter 方法設定為 public 
	 */
	private String person;
	private String place;


	public Hometown() {
		this(null,null);
	}

	
	//這是一個建構子(constructor)
	public Hometown(String person, String place) {
		this.person = person;
		this.place = place;
	}


	public String getPerson() {
		return person;
	}



	public void setPerson(String person) {
		this.person = person;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}


}
