import java.util.Scanner;

 public class ReverseANumber
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        int reversedNumber =0;
        for (; number !=0; number/=10)
        {
            int digit =number % 10;
            reversedNumber =reversedNumber *10 +digit;

        }
            // enter the numbers which you want revers
            System.out.println("Reverses number: " + reversedNumber);
    }
}