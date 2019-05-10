import java.io.*;
import java.util.*;
import java.util.ArrayList;
class Student
{
	String name;
	int id;
	String dept;
	
	Student(String name, int id, String dept)
	{
		this.name = name;
		this.id= id;
		this.dept = dept;
	}
}
class Department
{
	String name;
	private List<Student> students;
	
	Department(String name, List<Student> students)
	{
		this.name = name;
		this.students = students;
	}
	public List<Student> getStudents()
	{
		return students;
	}
}
class Institute
{
	String insName;
	private List<Department> departments;
	
	Institute(String insName, List<Department> departments)
	{
		this.insName =  insName;
		this.departments = departments;
	}
	public int getTotalStudentsInInstitute()
	{
		int noOfStudents=0;
		List<Student> students;
		for(Department dept : departments)
		{
			students = dept.getStudents();
			for(Student s : students)
			{
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}

class Aggregation
{
	public static void main(String args[])
	{
		Student s1= new Student("Veer", 1, "CSE");
		Student s2 =  new Student("Mahaveer", 2, "MCA");
		
		List <Student> cse_students = new ArrayList<Student>(); 
        cse_students.add(s1); 
		
		List <Student> mca_students = new ArrayList<Student>(); 
        mca_students.add(s2); 
		
        Department CSE = new Department("CSE", cse_students); 
        Department MCA = new Department("MCA", mca_students); 
          
		List <Department> departments = new ArrayList<Department>(); 
        departments.add(CSE); 
        departments.add(MCA); 
          
       
        Institute institute = new Institute("EGS", departments); 
          
        System.out.print("Total students in institute: "); 
        System.out.print(institute.getTotalStudentsInInstitute()); 
    } 
} 