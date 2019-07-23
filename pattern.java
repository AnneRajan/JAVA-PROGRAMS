//PATTERN 1
*****
****
***
**
*
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//PATTERN 2
*
**
***
****
*****
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//PATTERN 3
*
**
***
****
*****
****
***
**
*

    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//PATTERN 4

 *****
  ****
   ***
    **
     *

    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=5;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


//Pattern5
 public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=4;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
