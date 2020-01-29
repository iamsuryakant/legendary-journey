import java.util.Scanner;

class CheckEvenOdd
{
  private static Scanner input;

public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    input = new Scanner(System.in);
    num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}