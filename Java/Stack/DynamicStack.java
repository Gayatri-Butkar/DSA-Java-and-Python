package Java.Stack;

public class DynamicStack {
    
    int capacity = 2;
    int stack[] = new int[capacity];
    int top=0;

    public void push(int data)
    {
        if(size()==capacity)
        expand();
       stack[top] = data;
       top++;
        
    }
    private void expand()
    {
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity *= 2;
    }

    public int pop()
    {

        int data =0;
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
        
        top--;
        data = stack[top];
        stack[top]=0;
        shrink();
        }
        return data;
        
    }

    private void shrink()
    {
        int length = size();
        if(length <= capacity/4 && capacity > 2)
        {
        capacity = capacity/2;

        int newStack[] = new int[capacity];
         System.arraycopy(stack,0,newStack,0,length);
//           public static void arraycopy(Object source_arr, int sourcePos,
//                             Object dest_arr, int destPos, int len)
// Parameters : 
// source_arr : array to be copied from
// sourcePos : starting position in source array from where to copy
// dest_arr : array to be copied in
// destPos : starting position in destination array, where to copy in
// len : total no. of components to be copied. 

        stack = newStack;
 
        }

    }
    
    public int peek()
    {
        int data ;
        data = stack[top-1];
        return data;
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return top<=0;
    }
    public void show()
    {
        for(int n: stack)
        {
                System.out.println(n + " ");
        }
    }
}
