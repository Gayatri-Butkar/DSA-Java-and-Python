public class MergeSort
{

    public static void mergeSort(int arr[],int left,int right )
        {
            if(left < right)
            {
                int mid = (left + right) / 2;
                mergeSort(arr,left,mid);
                mergeSort(arr,mid+1,right);
                
                merge(arr,left,mid,right);
            }

        }

        public static void merge(int arr[],int left,int mid,int right)
        {

            int n1 = mid-left+1;
                int n2 = right - mid;
            int lArr[] = new int[n1];
            int rArr[] = new int[n2];

            for(int x =0; x<n1;x++)
            {
                lArr[x] = arr[left + x];
            }
            for(int x =0; x<n2;x++)
            {
                rArr[x] = arr[mid + 1 + x];
            }

            int i=0;
            int j=0;
            int k=left;
            while(i<n1 && j<n2)
            {
                if(lArr[i] <= rArr[j])
                {
                    arr[k] = lArr[i];
                    i++;
                }
                else
                {
                    arr[k] = rArr[j];
                    j++;
                }
                k++;
            }

            while(i<n1)
            {
                arr[k] = lArr[i];
                i++;
                k++;
            }
        }
    
    public static void main(String [] args)
    {
       int arr[] = {3,5,1,4,6,2};

       for(int n : arr)
       {
        System.out.print(n + " ");
       }

       System.out.println();

       mergeSort(arr,0,arr.length-1);
       System.out.println("After Sorting");
       for(int n: arr)
       {
        System.out.print(n + " ");
       }

    }
}


// SPLIT PHASE                         MERGE PHASE
// ──────────────────────────────────────────────────────
// [3, 5, 1, 4, 6, 2]
//       /          \
// [3, 5, 1]     [4, 6, 2]
//    /    \        /    \
// [3,5]  [1]   [4,6]  [2]
//  / \           / \
// [3][5]       [4][6]
//       ↓             ↓
//    merge#1        merge#3
//   [3]+[5]        [4]+[6]
//    =[3,5]         =[4,6]
//       ↓             ↓
//    merge#2        merge#4
//  [3,5]+[1]      [4,6]+[2]
//   =[1,3,5]       =[2,4,6]
//            ↘   ↙
//           merge#5
//     [1,3,5]+[2,4,6]
//      =[1,2,3,4,5,6] ✅

public class MergeSort
{
    public static void mergeSort(int arr[],int left,int right)
    {
        int mid = left+reight/2;
        if(left<right)
        {
            mergeSort(arr,left,mid);
            merget(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int arr[],int left ,int mid,int right)
    {
        int n1 = mid-left+1;
        int n2 = right- mid;
        int rArr[]=new int[n2];
        int lArr[]=new int[n1];

        
    }
}
public static void main(String[] args)
{

}
