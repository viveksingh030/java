package org.comviva.thread;

public class AccountClient implements Runnable
{   
	Account account;
	String name;
	int amount;
	AccountClient(String name,int amout,Account account)
	{   this.account=account;
		this.name=name;
		this.amount=amout;
		new Thread(this,name).start();
	}
	@Override
	public void run()
	{
		synchronized (account) {
			account.withDraw(amount);
		}
		
	}
	public static void main(String[] args)
	{
		Account account=new Account(1000);
		AccountClient accountClient=new AccountClient("vivek", 500, account);
		AccountClient accountClient2=new AccountClient("vinay", 750, account);
;	}
	
}
