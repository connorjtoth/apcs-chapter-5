package Chapter_5;
//*******************************************************
// ProcessTransactions.java
//
//CONNOR TOTH && IAN LEVY
//
// A class to process deposits and withdrawals for two bank
// accounts for a single day.
//*******************************************************
import java.util.Scanner;

import Chapter_5.Account;

public class ProcessTransactions
{
    public static void main(String[] args){

	Account acct1, acct2;           //two test accounts
	String keepGoing = "y";         //more transactions?
	String action;                  //deposit or withdraw
	double amount;                  //how much to deposit or withdraw
	long acctNumber;                //which account to access
	String answerDay = "y";

	Scanner scan = new Scanner(System.in);

	//Create two accounts
	acct1 = new Account(1000, "Sue", 123);
	acct2 = new Account(1000, "Joe", 456);
	
	
	//DAY LOOP
	while (answerDay.equals("y"))
	{
			//RESETS VARIABLES TO DAILY START VALUES
			keepGoing = "y";
			Account.resetStaticVariables();
			
			System.out.println("The following accounts are available:\n");
			acct1.printSummary();

			System.out.println();
			acct2.printSummary();

			while (keepGoing.equals("y") || keepGoing.equals("y"))
			    {
				//get account number, what to do, and amount
				System.out.print("\nEnter the number of the account you would like to access: ");
				acctNumber = scan.nextLong();
				System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");
				action = scan.next();
				System.out.print("Enter the amount: ");
				amount = scan.nextDouble();

				if (amount > 0)
				    if (acctNumber == acct1.getAcctNumber())
					if (action.equals("w") || action.equals("W"))
					    acct1.withdraw(amount);
					else if (action.equals("d") || action.equals("D"))
					    acct1.deposit(amount);
					else 
					    System.out.println("Sorry, invalid action.");
				    else if (acctNumber == acct2.getAcctNumber())
					if (action.equals("w") || action.equals("W"))
					    acct1.withdraw(amount);
					else if (action.equals("d") || action.equals("D"))
					    acct1.deposit(amount);
					else 
					    System.out.println("Sorry, invalid action.");
				    else
					System.out.println("Sorry, invalid account number.");
				else
					System.out.println("Sorry, amount must be > 0.");


				System.out.print("\nMore transactions? (y/n)");
				keepGoing = scan.next();
			    }

			//PRINTS AT END OF DAY
			//Print number of deposits
			System.out.println("Total deposit transactions:\t" + Account.getDepositCount());
			//Print number of withdrawals
			System.out.println("Total withdraw transactions:\t" + Account.getWithdrawCount());
			//Print total amount of deposits
			System.out.println("Total deposit value:\t" + Account.getDepositTotal());
			//Print total amount of withdrawals
			System.out.println("Total withdraw value:\t" + Account.getWithdrawTotal());
			
			//PROMPTS FOR NEXT DAY
			System.out.println("Would you like to continue to tomorrow's transactions? (y/n)");
			answerDay = scan.next();
	}
    }
}