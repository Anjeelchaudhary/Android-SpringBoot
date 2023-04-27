package com.corespring.lifecycle;

public class Human {
	private int expense;

	@Override
	public String toString() {
		return "Human [expense=" + expense + "]";
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}
}
