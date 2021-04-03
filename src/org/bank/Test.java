package org.bank;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

	Map<Integer, Employee> m=new LinkedHashMap<>();

		// 1st Employee details
		Employee e = new Employee();
		e.setName("Raja");
		e.setAge(54);
		e.setEmail("Raja123@gmail.com");
		e.setSalary(45678.98f);

		// 2nd Employee details
		Employee e1 = new Employee();
		e1.setName("Karthik");
		e1.setAge(34);
		e1.setEmail("Karthik123@gmail.com");
		e1.setSalary(76543.98f);

		m.put(1, e);
		m.put(2, e1);
		
	
		Set<Entry<Integer, Employee>> entrySet = m.entrySet();
		for (Entry<Integer, Employee> x : entrySet) {
			System.out.println(x.getKey());
			System.out.println(x.getValue().getName());
			System.out.println(x.getValue().getAge());
			System.out.println(x.getValue().getEmail());
			System.out.println(x.getValue().getSalary());
		}
	}
}
