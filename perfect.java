//Perfect number
    
    public static void main(String args[])
    {
        int num = 0,i,sum=0;
        int temp=num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        temp=num;
        if(num==sum)
        {
            System.out.println("Number " + num + " is a perfect number");
        }
        else
        {
            System.out.println("Number " + num + " is not a perfect number");

        }
        
        
    }

}
