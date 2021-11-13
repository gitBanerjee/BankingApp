package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account ethsamAccount = new Account(123456789,"Ethsham","ethsham@gmail.com"
        ,"9985647247");
        ethsamAccount.welcome();
        ethsamAccount.getCustomerName();
        ethsamAccount.getCustomerEmailAddress();
        ethsamAccount.setCustomerEmailAddress("ethsam@hotmail.com");
        ethsamAccount.getCustomerPhoneNumber();
        ethsamAccount.setCustomerPhoneNumber("1354665146");

    }
}

//Getters and setters are functions
//Access => Getters
//Setters => Setters
//Getter setters are always public

