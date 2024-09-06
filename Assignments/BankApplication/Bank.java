package Assignment6;

public interface Bank {
	double maxbalance=250000;
	double limitforwithdraw=5000;
	
	void deposite(SavingAccount account,double amount);
	
	void withdraw(SavingAccount account,double amount);
}
