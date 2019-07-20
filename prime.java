 public static void main(String args[])
    {
        int num,i = 0;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }  
        
        if(count==2)
        {
            System.out.println("Number is a prime number" +num);
        }
        else
        {
            System.out.println("Number is not a prime number" +num);
        }
    }
}
