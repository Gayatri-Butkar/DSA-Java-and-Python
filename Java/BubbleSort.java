public class BubbleSort {
  
    public static int[] bubblesort(int arr[])
    {
        // bubblesort(nums);
        for(int i=0;i<arr.length-1;i++)
        {
         for(int j= 0 ; j<arr.length-i-1;j++)
         {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] =arr[j+1];
                arr[j+1] = temp;
            }
         }
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};

        System.out.println("Before Sorting");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        
        //  System.out.println();
        // for(int num : nums)
        // {
        //     System.out.print(num + " ");
        // }

        int result[]=bubblesort(nums);

        

        System.out.println();

        System.out.println("After Sorting");
        for(int res : result)
        {
            System.out.print(res + " ");
        }
    }
    
}


