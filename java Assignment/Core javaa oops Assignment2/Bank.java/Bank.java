package oops;

public class Bank {
	public static void main(String[] args) {
		Savings s=new Savings();
		Current c=new Current();
		s.setBalance(20000);
		s.setFixedDeposit(100000);
		c.setCashCredit(10000);
		
		
		s.totalMoney();
		c.totalMoney();
	}

}



	