package oops;

public class Savings {
	private double fixedDeposit;
	private double balance;
	Savings(){
		setFixedDeposit(0.0);
		setBalance(0.0);
	}
	public double getFixedDeposit() {
		return fixedDeposit;
	}
	public void setFixedDeposit(double fixedDeposit) {
		this.fixedDeposit = fixedDeposit;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void totalMoney() {
		System.out.println("Total money in current account="+(fixedDeposit+balance));
		
	}


}
