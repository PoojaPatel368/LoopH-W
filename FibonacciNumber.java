import java.util.Scanner;
public class FibonacciNumber
{
    public static void main(String[]args)
    {
        int n,a = 0,b = 0, c = 1;
        Scanner scanner= new Scanner(System.in);
        // input value of n
        System.out.println("enter value of n:");
        n= scanner.nextInt();
        // print fibonacci of enter value
        System.out.println("fibonacci series");
        for (int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
    }

}
