//----------------------------------------------------------------------------------------------------
//Program #2
//Write a java program which demonstrates Linked List & Array List
//ArrayList
//-----------------------------------------------------------------------------------------------------
//Created by Gururaj Koni on 16/11/2021
//support www.konigraphics.in
//----------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student1 {
	String usn;
	String name;
	String course;

	Student1(String usn, String name, String course) {
		this.usn = usn;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", course=" + course + "]";
	}

}

public class Student {
	public static void main(String[] args) {
		List<Student1> aList = new ArrayList<Student1>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. ADD");
			System.out.println("2. DISPLAY");
			System.out.println("3. SEARCH");
			System.out.println("4. DELETE");
			System.out.println("5. CALCULATE NO OF STUDENTS");
			System.out.println("6. UPDATE");
			System.out.println("7. CLEAR");
			System.out.println("8. exit");
			int ch = sc.nextInt();

			if (ch == 1) {
				System.out.println("enter usn");
				String usn = sc.next();
				System.out.println("enter name");
				String name = sc.next();
				System.out.println("enter course");
				String course = sc.next();
				aList.add(new Student1(usn, name, course));
			} else if (ch == 2) {
				for (Student1 student : aList) {
					System.out.println(student);
				}
			} else if (ch == 3) {
				System.out.println("enter usn");
				String usn = sc.next();
				

				for (Student1 student : aList) {
					if (student.usn.equals(usn)) {
						System.out.println(student);
					}
				}
				System.out.println("data not found");
			} else if (ch == 4) {
				System.out.println("enter usn");
				String usn = sc.next();
				for (Student1 student : aList) {
					if (student.usn.equals(usn)) {
						aList.remove(student);
						System.out.println(aList);
						break;
					}
				}
			} else if (ch == 5) {
				System.out.println(aList.size());
			} else if (ch == 6) {
				System.out.println("enter usn");
				String usn = sc.next();
				for (Student1 student : aList) {
					if (student.usn.equals(usn)) {
						System.out.println(student);
						System.out.println("enter course");
						String course = sc.next();
						student.course = course;
						System.out.println(student);
					}
				}
			} else if (ch == 7) {
				aList.clear();
				System.out.println(aList);
			} else if (ch == 8) {
				System.out.println("EXITING...");
				break;
			}
		}
	}
}