import java.util.Scanner;
class Quesfourth{
   static Scanner sc=new Scanner(System.in);
   static void askforpositivenumber(){
   int num;
     do{
	  System.out.println("Enter positive number");
	  num=sc.nextInt();
	  }
	 while(num<=0);
	 System.out.println("You entered positive number"+num);
	 }
	 
	 public static void main(String args[])
	 {
	 askforpositivenumber();
	 sc.close();
	 }
	 }