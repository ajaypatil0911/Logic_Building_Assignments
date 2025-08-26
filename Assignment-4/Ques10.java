import java.util.Scanner;
class Ques10
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  int[]  arr=new int[5];
	  int i;
	  System.out.println("Enter 5 numbers=");
	  
	  for(i=0;i<5;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int sum=0;
	  for(i=0;i<5;i++)
	  {
		  sum=arr[i]+sum;
	  }
	  float avg=sum/5;
	  System.out.println("Sum of element is:"+avg);
   }
}