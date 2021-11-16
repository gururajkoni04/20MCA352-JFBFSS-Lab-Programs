//----------------------------------------------------------------------------------------------------
//Program #1
//Write a java program which demonstrates Generics with Key and Value
//-----------------------------------------------------------------------------------------------------
//Created by Gururaj Koni on 16/11/2021
//support www.konigraphics.in
//----------------------------------------------------------------------------------------------------
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Generics {

	String state;
	String capital;

	TreeMap<String, String> tm = new TreeMap<String, String>();

	public void setData(String state , String capital) {
		tm.put(state, capital);
	}

	public void getData() {
		System.out.println("State :\t Capital");
		System.out.println("--------------------");
		for(Map.Entry<String, String> word : tm.entrySet()) {
			System.out.println(word.getKey() +":"+word.getValue());
		}
		System.out.println("---------------------");
	}

	public void searchData(String key) {
		if(tm.containsKey(key)) {
			System.out.println("---------------------");
			System.out.println("KEY PRESENT");
			System.out.println("---------------------");
		}
		else {
			System.out.println("---------------------");
			System.out.println("KEY NOT PRESENT");
			System.out.println("---------------------");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Generics generics = new Generics();

		while(true) {
			System.out.println("1. ADD");
			System.out.println("2. SEARCH");
			System.out.println("3. DISPLAY");
			System.out.println("4. Exit");

			int ch = sc.nextInt();

			if(ch == 1) {
				System.out.println("Enter state");
				String state = sc.next();

				System.out.println("Enter capital");
				String capital = sc.next();


				generics.setData(state, capital);
			}
			else if(ch == 2) {
				System.out.println("Enter key to search");
				String key = sc.next();
				generics.searchData(key);
			}
			else if(ch == 3) {
				generics.getData();
			}
			else if(ch == 4) {
				System.out.println("EXITED");
				break;
			}
			else {
				System.out.println("INVALID OPTION");
			}
		}
	}

}