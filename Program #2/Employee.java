//----------------------------------------------------------------------------------------------------
//Program #2
//Write a java program which demonstrates Linked List & Array List
//LinkedList
//-----------------------------------------------------------------------------------------------------
//Created by Gururaj Koni on 16/11/2021
//support www.konigraphics.in
//----------------------------------------------------------------------------------------------------



import java.util.LinkedList;
import java.util.Scanner;
class Employee {
	String EID,Name;
	int age;
	public Employee(String EID,String Name,int age)
	{
		this.EID=EID;
		this.Name=Name;
		this.age=age;
	}
	public String getEID()
	{
		return EID;
	}
	public String getName()
	{
		return Name;
	}
	public int getAge()
	{
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		LinkedList<Employee> l = null;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("MENU\n1.Create Linked List\n2.Insert from front");
			System.out.println("3.Insert from Rear\n4.Delete from front\n5.Delete from rear\n6.Display Linked List Items\n7.Exit\nEnter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				l=new LinkedList<Employee>();
				break;
			case 2:
				System.out.println("Enter the Employee ID:\t");
				String eid=sc.next();
				System.out.println("Enter the Employee Name:\t");
				String n=sc.next();
				System.out.println("Enter the Employee Age:\t");
				int age=sc.nextInt();
				l.addFirst(new Employee(eid,n,age));
				break;
			case 3:
				System.out.println("Enter the Employee ID:\t");
				String eid2=sc.next();
				System.out.println("Enter the Employee Name:\t");
				String n2=sc.next();
				System.out.println("Enter the Employee Age:\t");
				int age2=sc.nextInt();
				l.addLast(new Employee(eid2,n2,age2));
				break;
			case 4:
				l.removeFirst();
				break;
			case 5:
				l.removeLast();
			case 6:
				System.out.println("-------------------------");
				System.out.println("EID \tName   \tAge");
				System.out.println("-------------------------");
				for(Employee e:l) {
					System.out.print(""+e.getEID());
					System.out.print("\t"+e.getName());
					System.out.println("  \t"+e.getAge());
				}
				System.out.println("-------------------------");
				break;
			case 7:
				System.exit(0);
			}
		}
	}
}