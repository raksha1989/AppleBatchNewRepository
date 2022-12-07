package abstraction;

public interface BankOperations {
	
	void loanFacility(); //public and abstract
	void depositMoney(int accno,int amount);
	void withdrawMoney(int accno,int amount);
	void moneyInvestment(int accno);
	void accountOpeningFacility();

}
