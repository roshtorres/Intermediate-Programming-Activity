package accountPackage;

public class Account 
{	
	 public static double debit(double accountBalance, double withdrawalAmount)
	 {
		 if (accountBalance >= withdrawalAmount) 
		 {
			 accountBalance = accountBalance - withdrawalAmount;
		 }
		else 
		{
			System.out.println("Debit amount exceeded account balance.");
		}
		 
		 return accountBalance;
	 }
		
}
