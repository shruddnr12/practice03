package prob05;

public class Account {
	
	private String accountNo;
	private int balance;
	public Account(String accountNo){
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}
	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}
	
	public void save(int save)
	{
		this.balance += save;
		System.out.println(this.accountNo + "계좌에 " + save + "만원이 입금되었습니다.");
	}
	
	public void deposit(int deposit)
	{
		this.balance -= deposit;
		System.out.println(this.accountNo + "계좌에 " + deposit + "만원이 출금되었습니다.");
	}
	
}
