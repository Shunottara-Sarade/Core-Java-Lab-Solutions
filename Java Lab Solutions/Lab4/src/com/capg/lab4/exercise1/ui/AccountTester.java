package com.capg.lab4.exercise1.ui;

import com.capg.lab4.exercise1.service.CurrentAccount;

public class AccountTester {

	public static void main(String[] args) {
		
		
		CurrentAccount curAcc = new CurrentAccount("ABC", 22, 789845, 500,200);
		System.out.println(curAcc);
		
		curAcc.withdraw(7002);
		System.out.println(curAcc);
		
		
	}

}