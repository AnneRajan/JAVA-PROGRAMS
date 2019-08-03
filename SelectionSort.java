public class SelectionSort {
    
    public static void main(String args[])
    {
    int i,j,min,temp,num = 0;
    Scanner sc=new Scanner(System.in);
       
        System.out.println("***SELECTION SORT***");
        System.out.println("Enter the number of elements:");
        num=sc.nextInt();
        
        int arr[]=new int[num];
        System.out.println("Enter the elements:");
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array of elements:");
        for(i=0;i<num;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        for(i=0;i<num;i++)
        {
            min=i;
            for(j=i+1;j<num;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        
        System.out.println("Sorted elementd in the selection sort:");
        for(i=0;i<num;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    
    }
    
}
