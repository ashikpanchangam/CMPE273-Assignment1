import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class JavaCollectionsExample {
	static HashMap<Integer, Student> studentDetails = new HashMap<Integer, Student>();

	public static void main(String[] args)
	{
		Scanner sc;
		int input;
		String studentName,studentSchool,studentEmailId,studentMajor,studentNumber;
		do{
			System.out.println("Enter 1 to add student details");
			System.out.println("Enter 2 to display the list of all the students");
			System.out.println("Enter 3 to exit");

			sc = new Scanner(System.in);
			input = Integer.parseInt(sc.nextLine());
			switch (input)
			{
			case 1: 
				System.out.println("Enter student name");
				studentName = sc.nextLine();
				System.out.println("Enter student number");
				studentNumber = sc.nextLine();
				System.out.println("Enter the school the student goes to");
				studentSchool = sc.nextLine();
				System.out.println("Enter the student EmailId");
				studentEmailId = sc.nextLine();
				System.out.println("Enter the student major");
				studentMajor = sc.nextLine();
				Boolean success = addStudent(studentName,studentNumber,studentSchool,studentEmailId,studentMajor);
				if(success)
				{
					System.out.println("The student details have been added successfully!");
				}
				else
				{
					System.out.println("The details you entered are invalid!!");
				}
				break;
			case 2:
				listOfStudents();
				break;
			case 3: 
				System.exit(0);
				break;
			default: 
				System.out.println("Enter a valid input");
				break;
			}
		}while(input != 3);
	}

	public static boolean addStudent(String studentName,String studentNumber,String studentSchool,String studentEmailId,String studentMajor)
	{
		boolean result = true;
		try
		{
			int studentNo = Integer.parseInt(studentNumber);
			Student student = new Student(studentName,studentNo,studentSchool,studentEmailId,studentMajor);
			studentDetails.put(studentNo, student);
		}
		catch(Exception E)
		{
			result = false;
		}
		return result;
	}

	public static void listOfStudents()
	{
		if(studentDetails.isEmpty())
		{
			System.out.println("The student list is empty");
		}
		else
		{
			for(Map.Entry<Integer, Student> element : studentDetails.entrySet())
			{
				Student student = element.getValue();
				System.out.println("Student Name: "+student.studentName+", Student Number: "+student.studentNumber+", Student school: "+student.studentSchool+", Student's EmailId: "+student.studentEmailId+", The student's Major: "+student.studentMajor);
			}
		}
	}
}