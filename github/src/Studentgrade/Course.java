package Studentgrade;

public class Course {
	private String name;
	private double grade;
	
	Course(String name, double grade) throws InputError
	{
		setGrade(grade);
		setName(name);
	}
	
	//setters and getters
	
	public void setName(String name)
	{
		this.name= name;
		}
	public void setGrade(double grade) throws InputError
	{
		this.grade = grade;
		if(grade < 0)
		{
			throw new InputError();
		}
		else if(grade > 100)
		{
			throw new InputError();
		}
		
	}
	
	public String getName()
	{
		return name;
	}
	public double getGrade()
	{
		return grade;
	}
	
	@Override
	public String toString()
	{
		return "Course name: " + name + "\nCourse grade: " + grade + "\n";
	}
	
}
class InputError extends Exception //if its over 100 its an error
{
	InputError(){
		super("Error! : Please enter a correct grade! ");
	}
}
