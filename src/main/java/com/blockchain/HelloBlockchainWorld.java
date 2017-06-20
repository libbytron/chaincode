package com.blockchain;






import java.math.BigInteger;

import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

public class HelloBlockchainWorld {	
	
	public static void deployAndTest()
	{
		try
		{
			Web3j web3 = Web3j.build(new HttpService());
			
			// "classpath:\\src\\main\\wallets\\myWallet.json" this doesnt work??
			// !! LOCAL DEPENDENCY !!
			Credentials credentials = 
					WalletUtils.loadCredentials(
							"Thebie-14-1", 
							"C:\\home\\chaincode-projects\\bare-bones\\src\\main\\wallets\\myWallet.json");
			
			
			// HOW MUCH INTRINSIC GAS TO GIVE??
			Greeter contract = Greeter.deploy(web3, credentials, BigInteger.ZERO, BigInteger.TEN, BigInteger.TEN, new Utf8String("Hello blockchain world!")).get();
			
			Utf8String greeting = (Utf8String) contract.greet();
			
			System.out.println(greeting.getTypeAsString());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
