import java.util.*;
// We have to use this because we have used user-defined class as a key in TreeMap 
class Platform implements Comparable{				// here by using this Comparable interface we will use the method compare to sort the data by the year
	String str = null;
	int year = 0;

	Platform(String str,int year){
		this.str= str;
		this.year = year;
	}
	public String toString(){
		return "{" + str + ":" + year + "}";
	}
	public int compareTo(Object obj){			// compareTo method of Comparable interface in wich we have used sort by year 
		return this.year - (((Platform)obj).year);
	}
}

class TreeMapDemo{
	public static void main(String[] args){

		SortedMap tm = new TreeMap();

		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("FaceBook",2003),"Meta");
		tm.put(new Platform("ChatGpt",2023),"OpenAI");

		System.out.println(tm);
	}
}


