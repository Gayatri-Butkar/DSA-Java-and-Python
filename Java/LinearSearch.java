public class LinearSearch
{
    public static int linearSearch(int[] array ,int target)
    {
         for(int i=0;i< array.length ;i++)
         {
                 if (array[i] == target)
                 {
                    return i;
                 }
                
                 }

                
                return -1;
            }

    public static void main(String[] args) {
        
       
    int numbers []= {12,13,15,11,67,32,21,87};
    int target = 32;
    
    int result = linearSearch(numbers, target);

    if (result != -1)
    {
        System.out.println("Target "+target+ "fount at index" +result );

    }
    else
        {
            System.out.println("Result at target " +target+" not found");
        }
    }

}