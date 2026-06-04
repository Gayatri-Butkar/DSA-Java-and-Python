package Java.Stack;
public class Runner
{
    public static void main(String[] args)
    {
       DynamicStack nums = new DynamicStack();
       
        System.out.println("Empty" +nums.isEmpty());

       nums.push(15);
       nums.push(8);
       nums.push(5);

       System.out.println("Top Element is "+nums.peek());
    //    nums.pop();
    nums.push(13);
    nums.push(7);
   //  System.out.println("size is" +nums.size());

   //  System.out.println("Empty" +nums.isEmpty());
    
   // System.out.println("Elements in the stack are");
   nums.pop();
   nums.show();
   //  nums.pop();
   //  nums.pop();
   //  nums.pop();
   //  nums.pop();
   

    }
}
