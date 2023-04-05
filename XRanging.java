import java.util.Scanner;
public class XRanging
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        // enter the amount any 1 to 20 number
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = a; i < 20; i++)
        sum =sum +i;
        // print the total of given  number
        System.out.println("The sum of x range is " + sum);
    }
}


