public static void main(String arg[])	
	{
	int i,j,count;
               System.out.print("Enter n value : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
               System.out.println("Prime numbers between 1 to "+n+" are ");
	for(i=2;i<=n;i++)
	{
	count=0;
	for(j=1;j<=i;j++)
	{
	   if(i%j==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(i+"  ");     
	}
	}
}
