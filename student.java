import java.util.*;
class Student
{  public static void main (String ar[])
	{
		ArrayList al=new ArrayList();
	al.add("Student1");
	al.add("Student2");
	al.add("Student3");
	al.add("Student4");
	System.out.println(al);
	al.remove("Student1");
	System.out.println(al);
}}