package com.ibm.core.java.lab4.ex1;

public class Main {

    public static void main(String[] args) {

    	Person p1 = new Person("Rahul",25);
        Person p2 = new Person("Vishal",24);

        SavingsAccount rahul =
                new SavingsAccount(p1, 2000);

        SavingsAccount vishal =
                new SavingsAccount(p2, 3000);

        // Deposit INR 2000 to rahul
        rahul.deposit(2000);
        rahul.deposit(2000);
        rahul.deposit(2000);
        rahul.withdraw(2000);

        // Withdraw INR 2000 from vishal
        vishal.withdraw(2000);

        System.out.println("Updated Account Details");

        System.out.println(
                rahul.getAccHolder().getName()
                + " Balance = INR "
                + rahul.getBalance());

        System.out.println(
                vishal.getAccHolder().getName()
                + " Balance = INR "
                + vishal.getBalance());
    }
}