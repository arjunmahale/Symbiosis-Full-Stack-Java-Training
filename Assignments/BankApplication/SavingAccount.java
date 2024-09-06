package Assignment6;

public class SavingAccount extends Person{
	private int accno;
	private String custname;
	private double balance;
	private Bank bank;
	public SavingAccount(String personname, String city, int accno, double balance, Bank bank) {
		super(personname, city);
		this.accno = accno;
		this.balance = balance;
		this.bank = bank;
		custname=personname;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "SavingAccount [accno=" + accno +" customer name : "+custname+ ", balance=" + balance + ", bank=" + bank + "]";
	}
	public void deposite(double amount) {
		bank.deposite(this, amount);
	}
	public void withdraw(double amount) {
		bank.withdraw(this, amount);
	}
	
}
