package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    private int deposit;
    private int withdraw;
    
    
    
    
    
    //생성자 작성
	public Account() {
	}

	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    
    //필요한 메소드 작성
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	
	
	public void showBalance() {
		System.out.println(balance);
	}
	

}
