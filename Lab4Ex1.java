package com.deloitte.lab4.ex1;




class Person {
	private String name;
	private float age;
	
	public Person() {
		
	}
 
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public float getAge() {
     return age;
 }
}


class Account {
 private static int accountCounter = 1000;  
 protected String accNum;
 protected double balance;
 protected Person accHolder;

 
 public Account(Person accHolder, double balance) {
     this.accNum = "ACC" + (++accountCounter);  
     this.balance = balance;
     this.accHolder = accHolder;
 }

 
 public void deposit(double amount) {
     balance += amount;
 }

 
 public void withdraw(double amount) {
     if (balance - amount >= 500) 
     {
         balance -= amount;
        System.out.println("Amount withdrawn successfully. Remaining balance : "+balance);
     } 
     else 
     {
         System.out.println("Insufficient balance. Minimum balance of INR 500 is required.");
        
     }
 }

 
 public double getBalance() {
     return balance;
 }

 public String getAccNum() {
     return accNum;
 }
}


class SavingsAccount extends Account {
 private final double minimumBalance = 500;  

 
 public SavingsAccount(Person accHolder, double balance) {
     super(accHolder, balance);
 }

 
 @Override
 public void withdraw(double amount) {
     if (balance - amount >= minimumBalance) {
         balance -= amount;
         System.out.println("Amount withdrawn successfully. Remaining balance : "+balance);
     } else {
         System.out.println("Withdrawal failed: Minimum balance of INR 500 must be maintained.");
         
     }
 }
}


class CurrentAccount extends Account {
 private double overdraftLimit;

 
 public CurrentAccount(Person accHolder, double balance, double overdraftLimit) {
     super(accHolder, balance);
     this.overdraftLimit = overdraftLimit;
 }


 @Override
 public void withdraw(double amount) {
     if (balance - amount >= overdraftLimit) {
         balance -= amount;
         System.out.println("Amount withdrawn successfully. Remaining balance : "+balance);
     } else {
         System.out.println("Withdrawal failed: Overdraft limit reached.");
         
     }
 }
}


public class Lab4Ex1 {
 public static void main(String[] args) {
     
     Person smith = new Person("Smith", 30);
     Person kathy = new Person("Kathy", 28);

     
     SavingsAccount smithAccount = new SavingsAccount(smith, 2000);
     CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000, 1000);  
     
     
     smithAccount.deposit(2000);
     System.out.println(smith.getName() + "'s updated balance after deposit: " + smithAccount.getBalance());

     
     kathyAccount.withdraw(2000);
     System.out.println(kathy.getName() + "'s updated balance after withdrawal: " + kathyAccount.getBalance());

     
     kathyAccount.withdraw(2000);  

     // Display final balances
     System.out.println(smith.getName() + "'s final balance: " + smithAccount.getBalance());
     System.out.println(kathy.getName() + "'s final balance: " + kathyAccount.getBalance());
 }
}
