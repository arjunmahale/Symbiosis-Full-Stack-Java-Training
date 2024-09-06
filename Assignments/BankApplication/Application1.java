package Assignment6;

public class Application1 {

	public static void main(String[] args) {
		Bank bank=new BankImplement2();
		SavingAccount account=new SavingAccount("Arjun", "Nashik", 1223, 20000, bank);
		account.deposite(100);
		System.out.println("--------------------");
		System.out.println(account);
		System.out.println("--------------------\nafter withdrawn");
		account.withdraw(200);
		System.out.println(account);
	}

}
