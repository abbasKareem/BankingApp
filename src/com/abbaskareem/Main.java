package com.abbaskareem;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Iraq bank");
        bank.addBranch("AL_Rashid");

        bank.addCustomer("AL_Rashid", "Tim", 50.05);
        bank.addCustomer("AL_Rashid", "Mike", 175.34);
        bank.addCustomer("AL_Rashid", "Percy", 220.12);

        if(bank.addBranch("Karbala")){
            System.out.println("Karabala branch is created");
        }
        bank.addCustomer("Karbala", "Abbas", 150.54);

        bank.addCustomerTransaction("AL_Rashid", "Tim", 44.22);
        bank.addCustomerTransaction("AL_Rashid", "Tim", 12.44);
        bank.addCustomerTransaction("AL_Rashid", "Mike", 1.65);
        bank.listCustomer("AL_Rashid", true);
        bank.listCustomer("Karbala", true);

        if (!bank.addCustomer("Hilaa", "ahmed", 45.3)){
            System.out.println("Error hilla branch does not exists");
        }

        if (!bank.addBranch("Karbala")){
            System.out.println("Karbala branch is already exists");
        }
        if (!bank.addCustomerTransaction("Karbala", "ali", 90.43)){
            System.out.println("Customer does not exists at branch");
        }
        if (!bank.addCustomer("AL_Rashid", "tim", 23.33)){
            System.out.println("Customer is already exists");
        }
    }
}
