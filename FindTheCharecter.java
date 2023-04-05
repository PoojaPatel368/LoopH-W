import java.util.Scanner;
public class FindTheCharecter
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String hello = scanner.nextLine();
        int charCount = hello.length() - hello.replaceAll("a", "").length();
        // count the number of "a" char in input string
        System.out.println(charCount);
    }
}

