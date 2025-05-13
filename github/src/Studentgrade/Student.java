package Studentgrade;
import java.util.Scanner;


public class Student {
	Scanner kb = new Scanner(System.in);
	private String name;
	Course [] courses;
	Student(String name)
	{
		setName(name);
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCourses()
	{
		String name;
		double grade;
		System.out.print("Enter the amount of courses: ");
		int input = kb.nextInt();
		kb.nextLine();
		courses = new Course [input];
		
		for(int i =0; i < courses.length; i++)
		{
			System.out.print("Enter name of the course: ");
			name = kb.nextLine();
			System.out.print("Enter grade of the course: ");
			grade = kb.nextDouble();
			kb.nextLine();
			try {
				courses[i] = new Course(name,grade);
			} catch (InputError e) {
				e.printStackTrace();
			}
		}
	}
	
	public void showCourses()
	{
		System.out.println(name + "'s" + "courses: ");
		for(int i = 0; i < courses.length; i ++)
		{
			System.out.print(courses[i].toString());
		}
	}
	 
	public double getGpa() {
		double total = 0;
		for(int i = 0; i < courses.length ; i++)
		{
			if(courses[i].getGrade()>92)
			{
				total +=4;
			}
			else if(courses[i].getGrade()>= 90)
			{
				total+=3.7;
			}
			else if(courses[i].getGrade()>= 87)
			{
				total+= 3.3;
			}
			else if(courses[i].getGrade()>= 83)
			{
				total+= 3;
			}
			else if(courses[i].getGrade()>= 80)
			{
				total+= 2.7;
			}
			else if(courses[i].getGrade()>= 77)
			{
				total+= 2.3;
			}
			else if(courses[i].getGrade()>= 73)
			{
				total+= 2;
			}
			else if(courses[i].getGrade()>= 70)
			{
				total+= 1.7;
			}
			else if(courses[i].getGrade()>= 67)
			{
				total+= 1.3;
			}
			else if(courses[i].getGrade()>= 65)
			{
				total+= 1;
			}
			else
			{
				total += 0;
			}
		}
		return total / courses.length;
	}
}

