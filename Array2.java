class Array2{
	public static void main(String args[])
	{
		int i;
		int[]a={34,90,5,10,1};
		int max=a[0];
	
	   for(i=0;i<=a.length-1;i++)
	   {
		   if (a[i]>max)
		   {
			   max=a[i];
		   }
		
	   }
	     System.out.println("largest element of an a array " +max);
	}
}