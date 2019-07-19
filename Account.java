class Account{
	String name;
	int accno;
	double balance;
	static int lastaccno=0;
	public static void main(String[] args) {
		Account acc1=new Account("harsh singh",1000);
		Account acc2= new Account();
		acc1.display();
		acc2.display();
		System.out.println(Account.lastaccno);
}


	static{
		lastaccno=1000;
		System.out.println("current Account Number :"+getlastaccno()+"\n\n\n");

	}
	Account(String n ,double b)
		{
		name=n;
		accno=++lastaccno;
		balance=b;

	}

	Account()
	{
		name="Anonymous";
		accno=++lastaccno;
		balance=50000;

	}

	void deposit(double amt)
	{
		balance +=amt;

	}
	void withdraw(double amt)
	{
		balance-=amt;

	}
	void display()
		{
		System.out.println("name of account holder:"+name);
		System.out.println("ACCOUNT NUMBER :"+accno);
		System.out.println("balance remaining:"+balance+"\n\n\n");
		
	}
	static int getlastaccno()
	{
		return lastaccno;
	}
}