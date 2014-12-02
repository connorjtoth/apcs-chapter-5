package Chapter_5;
import java.util.Scanner;
public class TransferTest
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Account account1 = new Account(50,"bob",123456789);
    Account account2 = new Account(0,"joe",234567890);
    String input = "random";
    while(!input.equals("quit"))
    {
   System.out.println("type \'quit\' to quit, \'transfer1\' to transfer from account 1 to account 2,\n"
       + "\'transfer2\' to transfer from account 2 to account 1");
   input = scan.next();
     if(input.equalsIgnoreCase("transfer1"))
     {
       System.out.println("enter the amount to transfer");
       double amt = scan.nextDouble();
       Account.transfer(account1, account2, amt);
     } 
     else if(input.equalsIgnoreCase("transfer2"))
     {
       System.out.println("enter the amount to transfer");
       double amount = scan.nextDouble();
       Account.transfer(account2, account1, amount);
     }
   }
     System.out.println(account1.toString());
     System.out.println(account2.toString());
 }
}
