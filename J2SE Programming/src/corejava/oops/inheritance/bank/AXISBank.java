package corejava.oops.inheritance.bank;

public class AXISBank implements Bank {
	private int amount;
	private int interestRate;
	private int noOfMonths;
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	@Override
	public void openAccount() {
		if(amount >= 5000)
		{
			System.out.println("Account has created");
		}
		else
		{
			System.out.println("Account not created");
		}

	}

	@Override
	public double calculateEMI() {
		double interest = (amount*noOfMonths*interestRate)/100;
		return interest/12;
	}

}
