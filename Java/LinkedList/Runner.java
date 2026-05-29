package Java.LinkedList;

public class Runner {
    
     public static void main(String[] args)
    {
        LinkedList1 list = new LinkedList1();

       list.insert(5);
       list.insert(10);
        list.insert(15);
        list.insertAtStart(25);
        list.insertAt(2,55);
        list.deleteAt(3);
        list.show();
        
    }
}
