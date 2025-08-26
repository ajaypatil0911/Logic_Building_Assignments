import java.util.Scanner;
class AgeChecker{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age=");
		int age=sc.nextInt();
		
		checkAgeCategory(age);
	}
	 static void checkAgeCategory(int age)
	{
		if(age<=18)
			System.out.println("Minor");
		else if(age>18&&age<=50)
			System.out.println("Adult");
		else if(age>50)
			System.out.println("senior citizen");
}
}

