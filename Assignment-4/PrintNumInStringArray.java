import java.util.Scanner;
class PrintNumInStringArray
{
  public static void main(String args[])
  {
	  int i;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter 4 names=");
	String[] names=new String[4];
	for(i=0;i<4;i++)
	{
	names[i]=sc.nextLine();
	}
	
	for(String temp:names)
	{
		System.out.println(temp);
	}
  }
}