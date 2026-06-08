package com.ibm.core.java.lab4.ex1;

public class Account {

	private static long accCounter = 1000;

	protected long accNum;
	protected double balance;
	protected Person accHolder;

	public Account(Person accHolder, double balance) {
		this.accNum = ++accCounter;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public boolean withdraw(double amount) {
		if (balance - amount >= 500) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}
}