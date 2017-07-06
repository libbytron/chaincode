package com.smartcontracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Future;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Int256;
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
public final class BankAccount extends Contract {
    private static final String BINARY = "6060604052341561000c57fe5b5b600080555b5b610101806100226000396000f300606060405263ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166312065fe08114605757806358ce2c81146076578063a66d98d9146088578063e5c19b2d14609a575bfe5b3415605e57fe5b606460ac565b60408051918252519081900360200190f35b3415607d57fe5b608660043560b3565b005b3415608f57fe5b608660043560c0565b005b341560a157fe5b608660043560cc565b005b6000545b90565b6000805482900390555b50565b60008054820190555b50565b60008190555b505600a165627a7a72305820ad1b5920e17f9ca928a774efc75968f4f15645a8097296ecf48099658b9ab9980029";

    private BankAccount(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private BankAccount(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<Int256> getBalance() {
        Function function = new Function("getBalance", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> decreaseBalance(Int256 x) {
        Function function = new Function("decreaseBalance", Arrays.<Type>asList(x), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> increaseBalance(Int256 x) {
        Function function = new Function("increaseBalance", Arrays.<Type>asList(x), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> set(Int256 b) {
        Function function = new Function("set", Arrays.<Type>asList(b), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<BankAccount> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(BankAccount.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<BankAccount> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(BankAccount.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static BankAccount load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BankAccount(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static BankAccount load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BankAccount(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
