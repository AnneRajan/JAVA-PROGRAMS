//ARMSTRONG NUMBER
    public static void main(String args[])
    {
        int num,sum=0,rem,c,temp=0;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
         temp=num;
        while(num>0)
        {
            rem=num%10;
            c=rem*rem*rem;
            sum=sum+c;
            num=num/10;
        }
        num=temp;
        if(num==sum)
        {
        System.out.println("Number "+num+ " is a Armstrong number");
        }
        else
        {
            System.out.println("Number "+num+ " is not a Armstrong number");
        }
        
    }
}
