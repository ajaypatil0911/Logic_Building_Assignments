import java.util.Scanner;
class Ques9
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
	  int lar=0;
	  for(i=0;i<5;i++)
	  {
		  if(arr[i]>lar)
		  {
			  lar=arr[i];
		  }
	  }
	  System.out.println("The largest element is:"+lar);
   }
}