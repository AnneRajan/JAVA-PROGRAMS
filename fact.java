public static void main(String args[])
{
    int fact=1,i,num;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    num=sc.nextInt();
    
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    System.out.println("Factorial of number:" +fact);
}

}
