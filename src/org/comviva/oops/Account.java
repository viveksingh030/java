package org.comviva.oops;

public class Account {
	private int accountNumber;
	private Name customerName;
	private double income;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	public void setAccountNumber(int accountNumber) {
		
		if(accountNumber<100)
		{
			System.out.println("Sorry! accountNumber can not be shorter than 100");
		}
		
		else
		{
			this.accountNumber = accountNumber;
		}
	}
	
	
	public String getCustomerName() {
		return customerName.getFirstname()+"  "+customerName.getMiddleName()+" "+customerName.getLastName();
	}
	
	
	public void setCustomerName(Name customerName) {
		String name=customerName.getFirstname()+customerName.getMiddleName()+customerName.getLastName();
		if(name.length()<4)
		{
			System.out.println("Sorry! Name can not be shrter than 4");
			this.customerName.setFirstname("No");
			this.customerName.setLastName("Name");
			this.customerName.setMiddleName("");
		}
		
		else
		{
			this.customerName = customerName;
		}
	}
	
	
	public double getIncome() {
		return income;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", income=" + income
				+ "]";
	}


	public void setIncome(double income) {
		
		if(income>=5000)
			this.income=income;
		
		else
		{
			System.out.println("Income can not be less than 5000");
		}
	}
	
	public void display()
	{
		System.out.println("accounNumner="+accountNumber+"\t"+"customerName="+customerName+"\t"+"income="+income);
	}
	

}
