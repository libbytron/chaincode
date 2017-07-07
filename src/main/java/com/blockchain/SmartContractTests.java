package com.blockchain;

import java.math.BigInteger;

import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;

import com.smartcontracts.BankAccount;
import com.smartcontracts.HelloWorld;

public class SmartContractTests {
	public static void testHelloWorld()
	{
		try
		{
			Web3j web3 = Web3j.build(new HttpService("http://52.177.190.91:8545"));
			
			// "classpath:\\src\\main\\wallets\\myWallet.json" this doesnt work??
			// !! LOCAL DEPENDENCY !!
			Credentials credentials = 
					WalletUtils.loadCredentials(
							"Thebie-14-1", 
							"C:\\home\\chaincode-projects\\bare-bones\\src\\main\\wallets\\myWallet.json");		
			System.out.println("Credentials loaded...");
			

			HelloWorld contract = HelloWorld.load("0x06d2407d996705443cbe70adea5189f2c9c59b72", web3, credentials, BigInteger.ZERO, BigInteger.valueOf(3000000));
			System.out.println("Contract loaded...");
			
			// false for some reason.......?
			System.out.println(contract.isValid());
			
			Utf8String greeting = contract.greet().get();
			System.out.println("Contract invoked...");
			
			System.out.println("New greeting is: " + greeting.toString());
			System.out.println("Result printed.");
			
			// TransactionReceipt receipt = contract.changeGreeting(new Utf8String("Hello to the BLOCKCHAIN world!")).get();
			greeting = contract.greet().get();
			// System.out.println("Last transaction receipt: " + receipt.getTransactionHash());
			System.out.println("Newer greeting is: " + greeting.toString());
			
		}
		catch (Exception e)
		{
			System.out.println("Exception caught!");
			System.out.println(e.getMessage());
		}
	}
	public static void testBankAccount()
	{
		try
		{
			Web3j web3 = Web3j.build(new HttpService("http://52.177.190.91:8545"));
			
			// "classpath:\\src\\main\\wallets\\myWallet.json" this doesnt work??
			// !! LOCAL DEPENDENCY !!
			Credentials credentials = 
					WalletUtils.loadCredentials(
							"Thebie-14-1", 
							"C:\\home\\chaincode-projects\\bare-bones\\src\\main\\wallets\\myWallet.json");		
			System.out.println("Credentials loaded...");
			
			System.out.println(credentials.getAddress());

			BankAccount contract = BankAccount.load("0x8f6f3a7b695ad12d1f5f4d234f640ac06793b439", web3, credentials, BigInteger.ZERO, BigInteger.valueOf(3000000));
			System.out.println("Bank Account contract loaded...");
			
			// false for some reason.......?
			System.out.println(contract.isValid());
			
			//TransactionReceipt receipt = contract.set(new Int256(15)).get();
			//System.out.println(receipt);
			Int256 balance = contract.getBalance().get();
			System.out.println("Balance is: " + balance.getValue().intValueExact());
			
			//contract.increaseBalance(new Int256(5));
			balance = contract.getBalance().get();
			System.out.println("Balance increased by 5: " + balance.getValue().intValueExact());
			
			//contract.decreaseBalance(new Int256(5));
			balance = contract.getBalance().get();
			System.out.println("Balance decreased by 5: " + balance.getValue().intValueExact());			
		}
		catch (Exception e)
		{
			System.out.println("Exception caught!");
			System.out.println(e.getMessage());
		}
	}
}
