 //TABLE OF ANY NUMBER
    
    public static void main(String args[])
    {
        int table,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a table");
        table = sc.nextInt();
        System.out.println("Table of "+table);
        for(i=1;i<=10;i++)
        {
            System.out.println(table +" * "+ i +" = " +table*i  );
        }
    }
}
