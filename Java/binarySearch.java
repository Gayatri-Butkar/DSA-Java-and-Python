
import java.util.Scanner;
public class binarySearch {
  
    public static int binarysearch(int arr[],int n,int target)
    {
    
            int low = 0;
            int high = n-1;

            while(low  <= high)
            {
                int mid = (low + high )/2;

                if(arr[mid] == target)
                {
                    return mid;
                }
                else if(arr[mid] < target)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid -1;
                }
            }
                return -1;
            
        }
            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of elements");
                int n = sc.nextInt();

                int array [] = new int[n];
                
                System.out.println("Enter elements to Search");
                for(int i=0;i<n;i++)
                {
                    array[i]= sc.nextInt();
                }

                System.out.println("Enter element tosearch");
                int target = sc.nextInt();

                int result = binarysearch(array,n,target);

                if(result != -1)
                {
                    System.out.println("Result found at " +result);
                }
                else{
                    System.out.println("Result not found");
                }
             
        sc.close();
            
    }
    
}
