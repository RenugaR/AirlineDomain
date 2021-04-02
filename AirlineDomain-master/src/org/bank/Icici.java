package org.bank;

public class Icici extends AxisBank {

	@Override
	public void deposit(int amount) {
		System.out.println("Interest :" + amount * 0.09);
	}

	@Override
	public void savings() {
		System.out.println("Savings amount is Rs.45,000");
	}

	public static void main(String[] args) {
		Icici i = new Icici();
		i.deposit(50000);
		i.savings();
	}
}
