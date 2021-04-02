package org.bank;

public class Icici extends AxisBank {
	
	@Override
	public void deposite(int amount) {
		System.out.println("Interest :"+amount*0.09);	}
	public static void main(String[] args) {
		Icici i=new Icici();
		i.deposite(50000);
		i.saving(100000);
	}
}
