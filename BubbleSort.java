public class BubbleSort {
    public static void main(String args[])
    {
        int num,i,j,temp;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("***BUBBLE SORT***");
        
        System.out.println("Enter a number");
        num=sc.nextInt();
        int[] arr= new int[num];
        
        System.out.println("Enter the elements in the array:");
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Given element: ");
        for(i=0;i<num;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        
        for(i=0;i<num-1;i++)
        {
            for(j=0;j<num-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Elements sorted in bubble sort:");
        for(i=0;i<num;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }  
}
