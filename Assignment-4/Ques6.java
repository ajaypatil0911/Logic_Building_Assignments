import java.util.Scanner;
class Ques6
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
   
   int[] arr=new int [5];
   
    System.out.println("Enter 5 elements=");
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("You entered elements are=");
	for(int brr:arr)
	{
		System.out.print(" "+brr);
	}
  
  }
}