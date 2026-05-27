import java.util.Scanner;
// class FirstClass
// {
//     public static void main(String args[])
//     {
//         System.out.println("Hello World with java");
//     }
// } 

class Rectangle
{
    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a ");
    a = sc.nextInt();
    System.out.println("Enter value of b ");
    b = sc.nextInt();   
    int area = 2*(a+b);
    System.out.println("Area of Rectangle is : " +area);
    }
}