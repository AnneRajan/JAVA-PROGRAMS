//Reverse a String
    public static void main(String args[])
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String name=sc.nextLine();
        String reverse="";
        int len=name.length();
        
        for(i=len-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
        }
        
        System.out.println("Reverse of "+name+ " is: "+reverse);
    }
}
