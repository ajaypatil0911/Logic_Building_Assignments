import java.util.Scanner;
class PrintSalary{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your salary");
		int sal=sc.nextInt();
		
		for(int i=1;i<=12;i++)
		{
			System.out.println("sal of "+i+"month="+sal*i);
		}
		
	}
}