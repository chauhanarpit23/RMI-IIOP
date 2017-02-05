import java.rmi.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

// Providing Implementation of Remote Interface.
public class BankImpl extends PortableRemoteObject implements BankInt

	{
		
						
				protected BankImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

				private void Super() {
			// TODO Auto-generated method stub
			
		}


				public int accountnumber;
				public int balance;
				public  int bankaccount (int numberIn) throws RemoteException //Function for Bank Account.
					
				{		
						accountnumber=numberIn;
						return(accountnumber);
				}
	
				public int deposit(int amountIn) throws RemoteException // Function for deposit.
				
				{ 
					int balance1 = this.balance+amountIn;
					return(balance1);
				}
			
				public int withdraw(int balance1,int amountIn)throws RemoteException //Function for withdraw.
				
				{ 
					balance= balance1-amountIn;
					return(balance); 
				} 
				
				public int getbalance()throws RemoteException //Balance Information Function.
				{ 
					return(balance); 
				}
	
				
				
				public static void main(String[] args)
				
				{ 
					try 
					{ 	BankImpl bankimpl=new BankImpl();//Connection procedure with the client.
						Context initialNamingContext = new InitialContext();
						initialNamingContext.rebind("HelloService", bankimpl );
						System.out.println("Server is Ready"); 
					} 

					catch(Exception e) 
						{ 
							System.out.println("Exception :" +e); 
						} 
				} 
	
	} 
	
