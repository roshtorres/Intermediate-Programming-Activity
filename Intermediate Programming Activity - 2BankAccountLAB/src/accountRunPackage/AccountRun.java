package accountRunPackage;
import accountPackage.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AccountRun 
{
	public static double account1Balance = 150.00;
	public static double account2Balance  = 500.53;
	
	public static void main (String args[])
	{
		Scanner input = new Scanner( System.in );
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		 double withdrawal1Amount, withdrawal2Amount;
		
		 System.out.println("account1 balance: " + "$" + df.format(account1Balance));
		 System.out.println("account2 balance: " + "$" + df.format(account2Balance));
		 System.out.println();
		 
		 //Account 1
		 System.out.print( "Enter withdrawal amount for account1: ");
		 withdrawal1Amount = input.nextDouble();
		 System.out.print("\n");
		 System.out.println("subtracting " + df.format(withdrawal1Amount) + " from account1 balance");
		 	if (account1Balance >= withdrawal1Amount) 
		 	{
		 		System.out.println( "account1 balance: " + "$" + df.format(Account.debit(account1Balance, withdrawal1Amount)));
		 		System.out.println( "account2 balance: " + "$" + account2Balance) ;
			 }
			 else 
			 {
				 Account.debit(account1Balance, withdrawal1Amount);
				 System.out.println( "account1 balance: " + "$" + df.format(account1Balance));
				 System.out.println( "account2 balance: " + "$" + df.format(account2Balance));
			 }

		 System.out.println();
		 
		 //Account 2
		 System.out.print("Enter withdrawal amount for account2: ");
		 withdrawal2Amount = input.nextDouble();
		 System.out.print("\n");
		 System.out.println("subtracting " + df.format(withdrawal2Amount) + " from account2 balance");
		 	if (account2Balance >= withdrawal2Amount) 
		 	{
		 		System.out.println( "account1 balance: " + "$" + df.format(Account.debit(account1Balance, withdrawal1Amount)));
		 		System.out.println( "account2 balance: " + "$" + df.format(Account.debit(account2Balance, withdrawal2Amount))) ;
			 }
			 else 
			 {
				 Account.debit(account2Balance, withdrawal2Amount);
				 System.out.println( "account1 balance: " + "$" + df.format(account1Balance));
				 System.out.println( "account2 balance: " + "$" + df.format(account2Balance));
			 }
	}

}
