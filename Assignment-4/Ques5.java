import java.util.Scanner;
class Ques5
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  
	  int sum=0;
	  for(int i=1;i<=num;i++)
	  {
		  if(i%2==1)
		  {
			  sum=sum+i;
			  
		  }
	  }
	   System.out.print(" "+sum);
	  
  }
}