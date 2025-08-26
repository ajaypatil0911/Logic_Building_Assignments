class SumOfNumber{
   public static void main(String args[])
   {
      int num=5;
     calculateSum(num);
   }
   static void calculateSum(int num)
   {
   int sum=0;
     for(int i=1;i<=num;i++)
	 {
	  sum=sum+i;
	 }
	 System.out.println("Sum of number="+sum);
   }
}