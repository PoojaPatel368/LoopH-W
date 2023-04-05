import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        // enter the number value
        System.out.print("Enter number:");
        int n=scanner.nextInt();
        for(int i=1; i <= 12; i++)
        {
            //print given values  time table
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}

