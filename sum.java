  //Sum of a number
    public static void main(String args[])
    {
        int num;
        int sum=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Reversed number:" +sum);
    }
}
