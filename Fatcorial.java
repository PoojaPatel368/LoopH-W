import  java.util.Scanner;
public class Fatcorial
{
            public static void main(String []args)
        {
//
            int num, k = 1, i;

            Scanner in = new Scanner(System.in);
            // Enter the number
            System.out.println("Enter an Integer");
            num = in.nextInt();

            for (i = 1; i <= num; i++){
                k = k * i;
            }
             // print the factorial number
            System.out.println("Factorial number is: " + k);
        }
    }


