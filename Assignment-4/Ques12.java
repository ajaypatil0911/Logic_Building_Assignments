import java.util.Arrays;
import java.util.Scanner;
class Ques12
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  int[] arr=new int[5];
	  int i;
	  System.out.println("Enter 5 numbers=");
	  
	  for(i=0;i<5;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  Arrays.sort(arr);
	  
	  System.out.println("Sorted Array in ascending order=");
	  for(int num:arr)
	  {
		  System.out.println(" "+num);
	  
   }
}
}