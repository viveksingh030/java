package org.comviva.oops;

public class AccountClient {
	public static void main(String args[])
	{
		Account account;
		account=new Account();
		account.setAccountNumber(100);
		Name name=new Name();
		name.setFirstname("vivek");
		name.setMiddleName("kumar");
		name.setLastName("singh");
		account.setCustomerName(name);
		account.setIncome(40000);
		System.out.println("accountId="+account.getAccountNumber());
		System.out.println("name="+account.getCustomerName());
		System.out.println("income="+account.getIncome());
		System.out.println(account);
		Account[] account2=new Account[4];
		account2[0]=new Account();
		account2[1]=new Account();
		account2[2]=new Account();
		account2[3]=new Account();
		account2[0].setAccountNumber(101);
		Name name2=new Name();
		name2.setFirstname("vinay");
		name2.setMiddleName("kumar");
		name2.setLastName("singh");
		account2[0].setCustomerName(name2);
		account2[0].setIncome(43000);
		account2[1].setAccountNumber(102);
		Name name3=new Name();
		name3.setFirstname("vikash");
		name3.setMiddleName("kumar");
		name3.setLastName("singh");
		account2[1].setCustomerName(name3);
		account2[1].setIncome(43000);
		account2[2].setAccountNumber(103);
		Name name4=new Name();
		name4.setFirstname("viraj");
		name4.setMiddleName("kumar");
		name4.setLastName("singh");
		account2[2].setCustomerName(name4);
		account2[2].setIncome(43000);
		account2[3].setAccountNumber(101);
		Name name5=new Name();
		name5.setFirstname("manohar");
		name5.setMiddleName("kumar");
		name5.setLastName("singh");
		account2[3].setCustomerName(name5);
		account2[3].setIncome(43000);
		for(int i=0;i<4;i++)
		{
			System.out.println(account2[i]);
		}
	}

}
