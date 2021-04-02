package org.customers;

import org.banks.HdfcBank;

public class Customer {

	
		public void customerName() {
			System.out.println("Customer name is Raja");
	}
		
		public static void main(String[] args) {
			Customer c=new Customer();
			c.customerName();
			
			HdfcBank h=new HdfcBank();
	
		}
}

