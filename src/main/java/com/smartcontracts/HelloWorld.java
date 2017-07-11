package com.smartcontracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.2.1.
 */
public final class HelloWorld extends Contract {
    private static final String BINARY = "6060604052341561000c57fe5b5b60408051808201909152600c8082527f48656c6c6f20776f726c64210000000000000000000000000000000000000000602090920191825261005191600091610058565b505b6100f8565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061009957805160ff19168380011785556100c6565b828001600101855582156100c6579182015b828111156100c65782518255916020019190600101906100ab565b5b506100d39291506100d7565b5090565b6100f591905b808211156100d357600081556001016100dd565b5090565b90565b6102bc806101076000396000f300606060405263ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663cfae32178114610045578063d28c25d4146100d5575bfe5b341561004d57fe5b61005561012d565b60408051602080825283518183015283519192839290830191850190808383821561009b575b80518252602083111561009b57601f19909201916020918201910161007b565b505050905090810190601f1680156100c75780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156100dd57fe5b61012b600480803590602001908201803590602001908080601f016020809104026020016040519081016040528093929190818152602001838380828437509496506101c695505050505050565b005b6101356101de565b6000805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156101bb5780601f10610190576101008083540402835291602001916101bb565b820191906000526020600020905b81548152906001019060200180831161019e57829003601f168201915b505050505090505b90565b80516101d99060009060208401906101f0565b505b50565b60408051602081019091526000815290565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061023157805160ff191683800117855561025e565b8280016001018555821561025e579182015b8281111561025e578251825591602001919060010190610243565b5b5061026b92915061026f565b5090565b6101c391905b8082111561026b5760008155600101610275565b5090565b905600a165627a7a72305820130ddca7ea6b9491f0ae5942c66a9772a4cb00d5b8db3cd38b19c376f96e56a50029";

    private HelloWorld(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private HelloWorld(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Utf8String> greet() {
        Function function = new Function("greet", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> changeGreeting(Utf8String newMessage) {
        Function function = new Function("changeGreeting", Arrays.<Type>asList(newMessage), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<HelloWorld> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(HelloWorld.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<HelloWorld> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(HelloWorld.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static HelloWorld load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorld(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static HelloWorld load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HelloWorld(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
