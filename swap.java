   //Swapping of two numbers using temp
   
    public static void main(String args[])
    {
        int temp,a=10,b=20;
        
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("Value of A:"+a);
        
        System.out.println("Value of B:"+b);
        
    }
}

//Swapping of two numbers without using swap

public static void main(String args[])
    {
        int temp,a=10,b=20;
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        
        System.out.println("Value of A:"+a);
        
        System.out.println("Value of B:"+b);
        
    }
}

//Swapping of two numbers without using swap

  public static void main(String args[])
    {
        int temp,a=10,b=20;
        
        a=a^b;
        b=a^b;
        a=a^b;
        
        
        System.out.println("Value of A:"+a);
        
        System.out.println("Value of B:"+b);
        
    }
}
