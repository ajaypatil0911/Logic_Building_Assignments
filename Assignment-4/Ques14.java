import java.util.Scanner;
import java.util.Arrays;
class Ques14
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
	System.out.println("Enter a number to search=");
	int search=sc.nextInt();
	
	int index=Arrays.binarySearch(arr,search);
	if(index>=0)
	{
		System.out.println("Found at index:"+index);
	}
	else
		System.out.println("Not Found");
}
}