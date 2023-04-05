import java.util.Scanner;
public class PrimeOrNot
{

  public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number:");
        int number =input.nextInt();
        int i;
        for ( i = 2; i <=number/2 ; i++)
        {
             if (number % 1 ==0)
           {
               //enter the value it will print not prime number
              System.out.println( number + " is not a prime number");
              break;
           }

        } if ((i>number/2))
              {
                  // enter the value it will print prime number
                  System.out.println(number + " is a prime number");
              }
   }




}
