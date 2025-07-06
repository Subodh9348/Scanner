import java.util.Scanner;
class Company 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		Employee E=new Employee();
		System.out.print("Enter eno:");
		E.eno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ename:");
		E.ename=sc.nextLine();
		System.out.println("Enter Department:");
		E.department=sc.nextLine();
		System.out.println("Enter fee:");
		E.fee=sc.nextDouble();
		System.out.println("Enter email:");
		E.email=sc.next();
		System.out.println("Enter mobile no:");
		E.mobile=sc.nextLong();
		System.out.println("Enter gender(m/f):");
		E.gender=sc.next().charAt(0);
		System.out.println("employeed or not(T/F):");
		E.employeed=sc.nextBoolean();
		
		System.out.println("the data is :.........................");
		System.out.println("eno is:"+E.eno);
		System.out.println("ename is:"+E.ename);
		System.out.println("Department is:"+E.department);
		System.out.println("Fee is:"+E.fee);
		System.out.println("email is:"+E.email);
		System.out.println("mobile no is:"+E.mobile);
		System.out.println("gender is :"+E.gender);
		System.out.println("Employeed is:"+E.employeed);
		
		
	}
}
class Employee
{
	int eno;
	String ename;
	String department;
	double fee;
	String email;
	long mobile;
	char gender;
	boolean employeed;
	
}
