package com.config;

import java.math.BigInteger;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import com.blockchain.ControllerResponse;
import com.blockchain.HelloWorld;

@Controller
public class WelcomeController {

	// inject via application.properties
	/*
	@Value("${welcome.message:test}")
	private String message = "Hello World";
	*/

	// Without response body tag, the controller attempts to return a view.
	@ResponseBody
	@RequestMapping(value="/response/submit", method=RequestMethod.POST)
	public String welcome(@RequestBody SurveyResponse surveyResponse) {
		// do something with the response.....
		
		
		System.out.print(surveyResponse.toString());
		return surveyResponse.toString();
	}
	
	@ResponseBody
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public ControllerResponse getMessage() {
		String greeting = "";
		try
		{
			Web3j web3 = Web3j.build(new HttpService("http://52.177.190.91:8545"));
			
			// "classpath:\\src\\main\\wallets\\myWallet.json" this doesnt work??
			// !! LOCAL DEPENDENCY !!
			Credentials credentials = 
					WalletUtils.loadCredentials(
							"Thebie-14-1", 
							"C:\\home\\chaincode-projects\\bare-bones\\src\\main\\wallets\\myWallet.json");			

			HelloWorld contract = HelloWorld.load("0x06d2407d996705443cbe70adea5189f2c9c59b72", web3, credentials, BigInteger.ZERO, BigInteger.valueOf(3000000));		
			Utf8String response = contract.greet().get();			
			greeting = response.toString();	
		}
		catch (Exception e)
		{
			System.out.println("Exception caught!");
			System.out.println(e.getMessage());
		}
		System.out.println("Request made: " + greeting);
		return new ControllerResponse(greeting);
	}
}