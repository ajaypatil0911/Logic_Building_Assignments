import java.util.Scanner;
class MenuDriven{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println(" 1: Grade Evaluation System  2: Leap Year Check   3: Day of the week  4: Exit ");
	System.out.println("Select your choice:");
	int ch=sc.nextInt();
	
	switch(ch)
	{
		case 1:
		        int math=90,sci=95,his=90,avg;
	         avg=(math+sci+his)/3;
	 
	   if(avg>=90)
	    {
	 	 System.out.println("Grade A");
	    }
	     else if(avg>=70&&avg<=89)
	    {
		 System.out.println("Grade B");
	     }
	     else if(avg>=50&&avg<=69)
	    {
		 System.out.println("Grade C");
	    }
	    else if(avg>=30&&avg<=49)
	   {
		 System.out.println("Grade D");
	   }
	    else if(avg<30)
	    {
		 System.out.println("Fail");
	    }
		
		break;
		
		case 2:
		     int year=2014;
         if(year%4==0)
         {
          System.out.println(year+" is leap year");
         }
        else
        {
         System.out.println(year+" is not leap year");
        }
		
		break;
		
		case 3:
		int day=7;
	switch(day)
	{
	  case 1: 
	  System.out.println("Sunday");
	  break;
	  case 2: 
	  System.out.println("Monday");
	  break;
	  case 3:
	  System.out.println("Tuesday");
	  break;
	  case 4:
	  System.out.println("Wednesday");
	  break;
	  case 5:
	  System.out.println("Thursday");
	  break;
	   case 6:
	  System.out.println("Friday");
	  break;
	   case 7:
	  System.out.println("Saturday");
	  break;
	  
	  default:
	  System.out.println("Enter valid date");
    }
	break;
	
	case 4:
	System.out.println("Exiting program...");
               System.exit(0);
	
	
			

  }
  }
}