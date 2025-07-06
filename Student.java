import java.util.Scanner;
class College 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter sno:");
		s.sno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter sname:");
		s.sname=sc.nextLine();
		System.out.println("Enter course:");
		s.course=sc.nextLine();
		System.out.println("Enter fee:");
		s.fee=sc.nextDouble();
		System.out.println("Enter email:");
		s.email=sc.next();
		System.out.println("Enter mobile no:");
		s.mobile=sc.nextLong();
		System.out.println("Enter gender(M/F):");
		s.gender=sc.next().charAt(0);
		System.out.println("Enter studying(T/F):");
		s.studying=sc.nextBoolean();
		System.out.println("................................");
		System.out.println("no is:"+s.sno);
		System.out.println("name is:"+s.sname);
		System.out.println("Course is:"+s.course);
		System.out.println("fee is:"+s.fee);
		System.out.println("email is:"+s.email);
		System.out.println("mobile number is:"+s.mobile);
		System.out.println("gender is:"+s.gender);
		System.out.println("studying or not:"+s.studying);
	}
}
class Student
{
	int sno;
	String sname;
	String course;
	double fee;
	String email;
	long mobile;
	char gender;
	boolean studying;
}
