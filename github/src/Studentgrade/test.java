package Studentgrade;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
	//declarations
	Scanner kb = new Scanner(System.in);
	int input;
	
	//main menu
	
	do
	{
		System.out.println("Welcome to the GPA Calculator!");
		System.out.println("What would you like to do today?\n1. Enter Information\n2. Exit");
		System.out.print("Enter your choice: ");
		input = kb.nextInt();
		kb.nextLine();
		if(input == 1)
		{
			System.out.print("Enter name: ");
			Student s = new Student(kb.nextLine());
			s.setCourses();
			int n;
			do {
				

			System.out.println("What would you like to do with your grades?\n1. Show courses\n2. Re-enter courses\n3. Show Gpa\n4. Exit");
			System.out.print("Enter your choice: ");
			n = kb.nextInt();
			kb.nextLine();
			if(n == 1)
			{
				s.showCourses();
			}
			else if(n== 2)
			{
				s.setCourses();
			}
			else if(n == 3)
			{
				System.out.print("The Gpa is: " + s.getGpa() + "\n");
			}
			else if(n == 4)
			{
				System.out.print("Exiting...\n");
			}
			}
			while(n != 4);
			
		}
	}
	while(input != 2);
	
	}

}
