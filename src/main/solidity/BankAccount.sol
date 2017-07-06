pragma solidity ^0.4.0;

// ADDRESS: 0x8f6f3a7b695ad12d1f5f4d234f640ac06793b439

contract BankAccount {
    int balance;
    
    function BankAccount() public{
        balance = 0;
    }
    
    /* main function */
    function getBalance() public constant returns (int) {
        return balance;
    }
    
    function set(int b){
        balance = b;
    }
    
    function increaseBalance(int x){
        balance += x;
    }
    
    function decreaseBalance(int x){
        balance -= x;
    }
}