package oops;

public class Current {
	private double cashCredit;
	public Current() {
		setCashCredit(0.0);	
	}
	public double getCashCredit() {
		return cashCredit;
	}
	public void setCashCredit(double cashCredit) {
		this.cashCredit = cashCredit;
	}
	public void totalMoney() {
		System.out.println("Total money in current account="+cashCredit);
		
	}
	


}
