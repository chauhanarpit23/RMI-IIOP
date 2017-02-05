/* Assignment 5 : Distributed Systems
 * Problem Statement:Java RMI Programming with IIOP
 * The following are the operations to be supported in menu form:

deposit  n  d     	deposit d dollars into account  n (input n and d together)
withdraw n  d		withdraw d dollars from account n (input n and d together)
balance  n		get the balance of account      n
exit			program exit

First of all we need to create the interface file and once that particular file is created than further implementation
file is formed and thereafter the server and the client file is created.Thus first of all we need to compile the interface
file thereafter client file for execution.

An RMI IIOP allows to work on the cross-platform basis.Thus it uses stub and tie object for communication with the remote object.In RMI skeleton is used instead of the tie and this is mainly used for the cross platform use of languages.

Thus the sequence is first the interface file than the implementation file and at last the server and the client file 
for the execution of program.

 */

import java.rmi.*;

// Creating the Remote Interface
public interface BankInt extends Remote 

	{
		int bankaccount (int numberIn)throws RemoteException;
		int deposit (int amountIn) throws RemoteException;
		int withdraw(int balance1,int amountIn) throws RemoteException;
		int getbalance() throws RemoteException;
		
	}
