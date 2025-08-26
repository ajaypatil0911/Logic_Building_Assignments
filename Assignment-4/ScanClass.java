import java.util.Scanner;

class ScanClass
{    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
		System.out.println("Enter your age:");
		int age =sc.nextInt();
		System.out.println("Enter your height");
		float height=sc.nextFloat();
		System.out.println("Enter your weight");
		int weight=sc.nextInt();
        System.out.println("Hello, " + name + " Your age is"+age+"  and your height is"+height+" and weight is "+weight");
    }
}