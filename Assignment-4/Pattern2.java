class Pattern2
{
   public static void main(String args[])
   {
    int i,j;
	for(i=1;i<=5;i++)
	{
		int num=1;
		for(j=1;j<=i;j++)
		{
			System.out.print(num);
			if(j<i)
			{
				System.out.print("*");
			}
			num=num+2;
		}
		System.out.println();
   }
}
}