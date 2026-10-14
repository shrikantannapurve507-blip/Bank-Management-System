package com.MiniProject;

import java.util.Scanner;

class Bank{
	private double balance = 1000.0;
	
	//withdraw money
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Enter a valid amount ");
		}
		else if(amount > balance) {
			System.out.println("Insufficient balance ");
		}
		else {
			balance = balance - amount;
			System.out.println("Withdraw Successful! ");
		}
		
	}
	
	//Credit Money
	public void credit(double amount) {
		if(amount <= 0) {
			System.out.println("Enter a valid amount ");
		}
		else {
			balance = balance = amount;
			System.out.println("money credited successfully ");
		}
	}
	
	//show balance
	public void showBalance() {
		System.out.println("Current Balance: RS. " + balance );
	}
}
	

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		int choice;
		
		do {
			
			System.out.println(" Bank Management System---------------------------");
			System.out.println("1. Withdraw");
            System.out.println("2. Credit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                System.out.print("Enter withdrawal amount: Rs. ");
                double withdrawAmount = sc.nextDouble();
                bank.withdraw(withdrawAmount);
                break;

            case 2:
                System.out.print("Enter credit amount: Rs. ");
                double creditAmount = sc.nextDouble();
                bank.credit(creditAmount);
                break;

            case 3:
                bank.showBalance();
                break;

            case 4:
                System.out.println("Thank you for using our bank!");
                break;

            default:
                System.out.println("Invalid choice! Try again.");
        }

    } while (choice != 4);

    sc.close();
	}
	
}
