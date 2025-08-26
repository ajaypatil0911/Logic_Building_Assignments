import java.util.Scanner;
class PrintTable{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter table=");
		int table=sc.nextInt();
		
		printMultiplicationTable(table);
	}
	static void printMultiplicationTable(int table)
	{
		
		for(int i=1;i<=10;i++)
		{
		System.out.println(table+"*"+i+"="+table*i);
		}
	}
}