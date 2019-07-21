// CALCULATOR
    public static void main(String args[])
    {
        int choice = 0, a,b,result;
        Scanner sc =new Scanner(System.in);
                while(choice!=5)
                {
                    System.out.println("CALCULATOR");
                    System.out.println("1.ADDITION");
                    System.out.println("2.SUBTRACTION");
                    System.out.println("3.MULTIPLICATION");
                    System.out.println("4.DIVISION");
                     System.out.println("5.EXIT");
                    System.out.println("Enter your choice");
                    choice=sc.nextInt();
                    
                    switch(choice)
                    {
                        case 1:
                        {
                            System.out.println("Enter two numbers");
                            a=sc.nextInt();
                            b=sc.nextInt();
                            result = a+b;
                            System.out.println("Addition of " +a+ " + " +b+ " =" +result);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter two numbers");
                            a=sc.nextInt();
                            b=sc.nextInt();
                            result = a-b;
                            System.out.println("Subtraction of " +a+ " - " +b+ " = " +result);
                            break;
                        }  
                        case 3:
                        {
                            System.out.println("Enter two numbers");
                            a=sc.nextInt();
                            b=sc.nextInt();
                            result = a*b;
                            System.out.println("Multiplication of " +a+ " * " +b+ " = " +result);
                            break;
                        }  
                        case 4:
                        {
                            System.out.println("Enter two numbers");
                            a=sc.nextInt();
                            b=sc.nextInt();
                            result = a/b;
                            System.out.println("Division of " +a+ " / " +b+ " = " +result);
                            break;
                        }  
                        
                        case 5:
                        {
                            System.out.println("Exit");
                            break;
                        }
                        default:
                        {
                            System.out.println("Invalid choice!!");
                        }
                    }
                }
        
    }


}
