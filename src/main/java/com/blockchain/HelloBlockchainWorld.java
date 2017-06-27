package com.blockchain;






import java.math.BigInteger;
import java.util.concurrent.Future;

import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;

public class HelloBlockchainWorld {	
	
	public static void deployAndTest()
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
}
