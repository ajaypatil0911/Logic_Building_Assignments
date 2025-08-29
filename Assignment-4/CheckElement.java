import java.util.Arrays;
import java.util.Scanner;
class CheckElement
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
	  System.out.println("Enter a number to search=");
	  int search=sc.nextInt();
	  boolean found=false;
	  for(int num:arr)
	  {
		  if(num==search)
		  {
			  found=true;
		  }
	  }
	  if(found)
	  {
		  System.out.println("Found");
	  }
	  else
	  {
          System.out.println("Not Found");
   }
}
}