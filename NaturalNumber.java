import java.util.Scanner;
public class NaturalNumber
{
        public static void main(String[] args)

        {

            Scanner scanner = new Scanner(System.in);
            // enter the value
            System.out.println("Enter a number");
            int n = scanner.nextInt();
            int i,sum=0;

            for(i=0;i<=n;i++)
            {
                sum = sum + i;
            }

             // print the given number sum
            System.out.println("sum of number :"+sum);
        }
}


