package Assignment6;

public class BankImplement2 implements Bank{

	@Override
	public void deposite(SavingAccount account, double amount) {
		if(amount>maxbalance) {
			System.out.println("max balance limit exceed");
		}
		else
		{
			account.setBalance(account.getBalance()+amount);
			System.out.println("deposited "+amount+" into account "+account.getAccno());
		}
		
	}

	@Override
	public void withdraw(SavingAccount account, double amount) {
	
		if(account.getBalance()-amount>=limitforwithdraw)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("withdrawn "+amount+" from account "+account.getAccno());
		}
		else
		{
			System.out.println("insufficient balance in account "+account.getAccno());
		}
	}

}
