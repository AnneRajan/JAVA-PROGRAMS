public class InsertionSort {
    public static void main(String[] args) {
        
        int i,j,key,num=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***SELECTION SORT***");
        System.out.println("Enter the number of elements:");
        num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter "+num+ " elements in the array");
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Given elements in the array:");
        for(i=0;i<num;i++)
        {
            System.out.println(arr[i]+"\t");
        }
        
        for(i=1;i<num;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println("Sorted elements in the insertion sort:");
        for(i=0;i<num;i++)
        {
            System.out.println(arr[i]+"\t");
        }
        
    }
}
