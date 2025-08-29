class ArrayExample{
	 public static void main(String args[])
	 {
		 double []height={5.11,5.3,6,5.2,6.5,5.5,4.2,3.8,6.8};
		 
		 int count=height.length;
		 double sum=0;;
		 for(int i=0;i<count;i++)
		 {
			 sum=sum+height[i];
		 }
		 double avg=sum/count;
		 System.out.println(avg);
		 //for(double h:height)
		// {
	 }
}