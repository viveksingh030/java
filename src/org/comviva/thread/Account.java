package org.comviva.thread;

public class Account
{
	int balance;
	public Account(int bal)
	{
		this.balance=bal;
	}
	public  void withDraw(int amount)
	{
		if(amount<balance)
		{
			try {
				Thread.sleep(1000);
				System.out.println("balance is "+balance);
				balance-=amount;
				System.out.println("You have withDrawn amount "+amount+" Remaining balance ="+balance);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Sorry ! you dont have enough balance");
		}
	}
}
