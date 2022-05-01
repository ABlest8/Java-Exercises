package com.task3;

public class Account {
    String owner;
    int balance;
    int accountNumber;
    public Account(String owner, int balance, int accountNumber){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void transfer(int amount) throws NotEnoughMoneyException{
        if(amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Not enough money");
        }
    }

    public static void main(int args[]) throws NotEnoughMoneyException {
        Account client = new Account("Akif Burak YILDIRIM", 56462, 21793995);
        try{
            client.transfer(500);
        }
        catch(NotEnoughMoneyException x){
            System.out.println(x);
            x.printStackTrace();
        }
        finally{
            System.out.println(client.getBalance());
        }

    }
}