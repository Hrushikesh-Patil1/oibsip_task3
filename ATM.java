import java.util.ArrayList;
import java.util.Scanner;

public class ATM 
{
    	public static String name;
    	public static int balance=0;
    	public static String accnumber;
    	public static ArrayList<String> history=new ArrayList<String>();

    	static void updatebalance(int dcash)
    	{
        	balance=balance+dcash;
    	}
    
    	static void showbalance()
    	{
        	System.out.println(balance);
    	}
    
	public static void homepage()
	{
        	
       	  	Scanner sc=new Scanner(System.in);
       	    System.out.println("--------------------------");
        	System.out.println("Welcome to ATM");
        	System.out.println("--------------------------");
        
        	System.out.println("Select option :");
        	System.out.println("1. Register");
        	System.out.println("2. Exit");
       	 	System.out.println("Enter your choice : ");
        	int choice =sc.nextInt();
        
		if (choice==1)
		{
                	BankAccount.register();
        }
        
		else 
		{
            		if(choice==2)
            		{
                		System.exit(0);
            		}
            
            		else
            		{
                		System.out.println("select a value only from the given options :");
                		homepage();
            		}
        	}
    	}
    
	static void prompt()
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("WELCOME "+ATM.name+"! TO ATM SYSTEM");
        	System.out.println("---------------------");
        
		System.out.println("Select option : ");
        	System.out.println("1. Withdraw");
        	System.out.println("2. Deposit");
        	System.out.println("3. Transfer");
        	System.out.println("4. Check balance");
        	System.out.println("5. Transaction History");
        	System.out.println("6. Exit");
        
		System.out.print("Enter your choice : ");
        	int choice=sc.nextInt();
        	
		switch (choice) 
		{
            		case 1:
                		Transaction.withdraw();
            
            		case 2:
                		Transaction.deposit();
            
            		case 3:
                		Transaction.transfer();
            
            		case 4:
                		CheckBal.checkbalance();
            		
            		case 5:
                		History1.transactionhistory();
            
            		case 6:
                		System.exit(0);
        	}
    	}

    	public static void main(String[] args) 
    	{
    			homepage();
    	}
}