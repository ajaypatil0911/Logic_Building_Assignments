import java.util.Scanner;
class Ques24
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String=");
	String name=sc.nextLine();
	
	String reversed = new StringBuilder(name).reverse().toString();
	
	System.out.println("Reversed String="+reversed);
   }
}