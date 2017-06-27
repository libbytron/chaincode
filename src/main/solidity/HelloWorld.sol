pragma solidity ^0.4.0;
contract HelloWorld {
    string message;
    
    function HelloWorld() public{
        message = "Hello world!";
    }
    
    /* main function */
    function greet() public constant returns (string) {
        return message;
    }
    
    // This wil be a transaction because it is not a const function
    function changeGreeting(string newMessage) public {
        message = newMessage;
    }
}