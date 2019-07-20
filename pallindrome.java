    
//  Pallindrome numbers
    
    public static void main(String[] args)
    {
        
        int sum=0,rem;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        
        while(num>0)
        {
           rem=num%10;
           sum=sum*10+rem;
           num=num/10;
        }
        num=temp;
        if(num==sum)
        {
            System.out.println("Number is a pallindrome " +num);
        }
        else
        {
            System.out.println("Number is not a pallindrome " +num);
        }
        
    }
    
}
