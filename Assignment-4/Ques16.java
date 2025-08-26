class Ques16
{
  public static void main(String args[])
  {
	  int i,j;
	  
	  for(i=1;i<=5;i++)
	  {
		  for(j=1;j<=i;j++)
		  {
			  System.out.print(j);
			  if(j<i)
			  {
				  System.out.print("*");
		  }
		  }
		  System.out.println();
	  }
  }
}
