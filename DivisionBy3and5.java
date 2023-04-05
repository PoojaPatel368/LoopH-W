import java.util.Scanner;
public class DivisionBy3and5
{
public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);

        int n;
        //Enter the number btw 1 to 100
        System.out.print(" number: ");
        n=input.nextInt();
        //Enter the number btw 1 to 100 and it divided by 3
        System.out.println("Divided by : 3");
        for (int i = 1; i <= n; i++)
          {
              if(i%3==0) System.out.print(i+", ");
          }
        //Enter the number of 1 to 100 and it divided by 5
             System.out.println("\nDivided by : 5");
             for (int i = 1; i <= n; i++)
               {
                 if(i%5==0) System.out.print(i+", ");
               }


   }
}