import java.util.Scanner;
class Ques3{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number=");
	 int num=sc.nextInt();
	 
	 int fact=num*num*num;
	 System.out.println("Factorial of "+num+" is="+fact);
}
}