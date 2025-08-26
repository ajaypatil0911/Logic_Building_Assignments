import java.util.Scanner;
class Ques11
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
	  int poscount=0;
	  int negcount=0;
	  for(i=0;i<5;i++)
	  {
		 if(arr[i]>0)
		 {
			 poscount++;
		 }
		 else if(arr[i]<0)
		 {
			 negcount++;
		 }
	  }
	  System.out.println("Positive Number="+poscount);
	  System.out.println("Negative number="+negcount);
   }
}