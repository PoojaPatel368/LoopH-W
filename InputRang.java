import java.util.Scanner;

public class InputRang
{
    //print any 10 numbers btw  given/user input range
    public static void main(String[]args)
    {
           Scanner scanner = new Scanner(System.in);
            // enter fist number
            System.out.println("enter input any first number :");
            int x =scanner.nextInt();
            //enter last number
            System.out.println("enter input  any last number :");
            int y =scanner.nextInt();

            for (x = x; x <=y; x++)
            {
               System.out.println(x);
            }
    }

}
