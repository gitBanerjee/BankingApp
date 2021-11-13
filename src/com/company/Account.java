package com.company;

public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //Constructors

    public Account(int number, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = 0;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // Getters and Setters
    public void getCustomerEmailAddress() {
        System.out.println("Your email id is " + this.customerEmailAddress);
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
        System.out.println("Your New email address is " + this.customerEmailAddress);
    }

    public void getCustomerPhoneNumber() {
        System.out.println("Your phone number is " + this.customerPhoneNumber);
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Your New Phone Number is " + this.customerPhoneNumber);
    }

    public void getCustomerName() {
        System.out.println("Your Name is " + this.customerName);
    }



    //Functions made by us

    public void welcome(){
        System.out.println("Welcome Mr. " + this.customerName + " to this & this Bank. Your Current Balance is Rs. " + this.balance);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("The amount deposited is " + depositAmount + ". Now Available balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0){
            System.out.println("You have insufficient funds");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " is processed. Remaining balance is " + this.balance);
        }
    }
}

