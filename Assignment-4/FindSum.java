import java.util.Scanner;
class FindSum
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of array=");
	 int size=sc.nextInt();
	 int[] arr=new int[size];
	 System.out.println("Enter elements=");
	 for(int i=0;i<size;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 int sum=0;
	 for(int i=0;i<size;i++)
	 {
		 sum=arr[i]+sum;
	 }
	 System.out.println("Sum of all elements="+sum);
  }
}