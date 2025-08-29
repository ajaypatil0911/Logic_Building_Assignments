import java.util.Scanner;
class PrintMul{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number=");
	int num=sc.nextInt();
	
	for(int i=3;i<=num;i++)
	{
		if(i%3==0)
		{
			System.out.print(" "+i);
		}
	}
	
  }
} 