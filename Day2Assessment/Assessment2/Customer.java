package Day2Assessment;

public class Customer extends Person {
	private int cust_Id;
	private int account_Number;
	private double balance;

	public Customer(int cust_Id, int account_Number, double balance, String name, String gender) {
		super(name, gender);
		this.cust_Id = cust_Id;
		this.account_Number = account_Number;
		this.balance = balance;
	}

	public int getCust_Id() {
		return cust_Id;
	}

	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}

	public int getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(int account_Number) {
		this.account_Number = account_Number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Customer ID :" + cust_Id + ", Account Number :" + account_Number + ", Balance :" + balance);
	}

}
