package com.blockchain;

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
public final class Greeter extends Contract {
    private static final String BINARY = "60606040525b60008054600160a060020a03191633600160a060020a03161790555b5b6101a8806100316000396000f300606060405263ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166341c0e1b58114610045578063cfae321714610057575bfe5b341561004d57fe5b6100556100e7565b005b341561005f57fe5b610067610129565b6040805160208082528351818301528351919283929083019185019080838382156100ad575b8051825260208311156100ad57601f19909201916020918201910161008d565b505050905090810190601f1680156100d95780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6000543373ffffffffffffffffffffffffffffffffffffffff908116911614156101265760005473ffffffffffffffffffffffffffffffffffffffff16ff5b5b565b61013161016a565b5060408051808201909152600b81527f68656c6c6f20776f726c6400000000000000000000000000000000000000000060208201525b90565b604080516020810190915260008152905600a165627a7a7230582036b83c116d83580aa86dd3a0ea9e18d9c2ffbd90ea563fd63e08a9b773e0fc690029";

    private Greeter(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Greeter(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<TransactionReceipt> kill() {
        Function function = new Function("kill", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Utf8String> greet() {
        Function function = new Function("greet", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<Greeter> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Greeter.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<Greeter> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Greeter.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Greeter load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Greeter(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Greeter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Greeter(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
