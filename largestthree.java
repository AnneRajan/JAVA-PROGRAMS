
import java.util.Scanner;

/**
 *
 * @author Rajan
 */
public class practice {
    
    //largest numbers
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double num1 ,num2 = 0,num3 = 0,i;
        
        System.out.println(" Enter three number:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        
        System.out.println("Frist number:" +num1);
        System.out.println("Second number:" +num2);
        System.out.println("Third number:" +num3);
        
        if(num1>num2 && num1>num3)
        {
           System.out.println("First number is greater" +num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("Second number is greater" +num2);
        }
        else
        {
            System.out.println("Third number is greater" +num3);
        }
    }
    
}
