
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;



//Client Side Program.
public class Client
{
	public static void main(String[] args) 
	{
	
		Context ic;
    	Object objref;
    	BankInt bankimpl1;
		{
			try
			{	ic= new InitialContext();// Connection procedure with the Server.
				objref = ic.lookup("HelloService");
				bankimpl1 = (BankInt) PortableRemoteObject.narrow(
		                objref, BankInt.class);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Scanner sc= new Scanner(System.in);
				int number =0;
				int ch;
				int bal=0;
				while(true)
				{ 
					{	
						System.out.println("Welcome to US Bank"); 
						System.out.println("Press 1 for deposit"); 
						System.out.println("Press 2 for withdraw");
						System.out.println("Press 3 for balance info");
						System.out.println("Press 4 for exit");
						System.out.println("\nEnter your choice:");
						ch=Integer.parseInt(br.readLine());
					}
			
			
					if(ch == 1)
						
					{
						System.out.println("\n Enter the account number & amount :"); 
						int ac=Integer.parseInt(br.readLine());
						int dp=Integer.parseInt(br.readLine());
						bal=bankimpl1.deposit(dp);
						System.out.println("Final balance:"+ bal);
					}
					
					else if (ch == 2)
					{
						
						System.out.println("\n Enter the account number & amount:"); 
						int ac1=Integer.parseInt(br.readLine());
						int wd=Integer.parseInt(br.readLine());
						int balance=bankimpl1.withdraw(bal,wd);
						System.out.println("Final balance is:"+ balance);	
					}
					
					else if (ch == 3)
					{	
						int balance2=bankimpl1.getbalance();
						System.out.println("Current Balance is:"+ balance2);
					}
					else if (ch == 4)
					{
						System.out.println("Thank you for using the service");
						break;
					}
				}
		
			}			
				catch(Exception e)
				{
				
				}
				
		}

	}
}
