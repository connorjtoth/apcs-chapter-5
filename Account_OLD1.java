package Chapter_5;
//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*******************************************************

public class Account
{
  private double balance;
  private String name;
  private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
       balance -= amount;
    else
       System.out.println("Insufficient funds");
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
	return ("Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance);
  }
  
  //----------------------------------------------
  // Transfers funds from this account to account acct 
  //----------------------------------------------
  public void transfer(Account acct, double amount)
  {
    if (balance < amount)
    {
      System.out.println("ERROR! INSUFFICIENT FUNDS YO!");
      
    }
    else
    {
      withdraw(amount);
      acct.deposit(amount);
     
    }
   }
  public static void transfer(Account acct1, Account acct2 , double amount )
  {
    if (acct1.getBalance() < amount)
    {
      System.out.println("ERROR! INSUFFICIENT FUNDS YO!");
      
    }
    else
    {
      acct1.withdraw(amount);
      acct2.deposit(amount);
     
    }
  }
  }