package stockmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass 
{
	static void menu()
	{	
		System.out.println("\n-------------------WELCOME TO STOCK MANAGEMENT SYSTEM-------------------\n");
		System.out.println();
		System.out.println("1  -  Add Stock Details");
		System.out.println("2  -  Search for Stock Details");
		System.out.println("3  -  Edit Stock Details");
		System.out.println("4  -  Delete Stock Details ");
		System.out.println("5  -  Display all Stock Details ");
		System.out.println();
		System.out.println("6  -  Add Supplier Details");
		System.out.println("7  -  Search for Supplier Details");
		System.out.println("8  -  Edit Supplier Details");
		System.out.println("9  -  Delete Supplier Details ");
		System.out.println("10 -  Display all Supplier Details ");
		System.out.println();
		System.out.println("11 -  Add Payment Details");
		System.out.println("12 -  Search Payment Details ");
		System.out.println("13 -  Display all Payment Details ");
		System.out.println("14  -  EXIT ");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		StockClass stcl =new StockClass();
		SupplierClass spcl=new SupplierClass();
		PaymentClass pmcl=new PaymentClass();
		
		ArrayList <StockClass> a1=new ArrayList <StockClass>();
		ArrayList <SupplierClass> a2=new ArrayList <SupplierClass>();
		ArrayList <PaymentClass> a3=new ArrayList <PaymentClass>();
		
		int option;
		do
		{	
			menu();
			System.out.println("Enter your choice : ");
			option=sc.nextInt();
			switch(option)
			{
			case 1: 
					stcl.addNewStock(stcl);
					break;
			case 2: 
					stcl.searchStock(stcl);
					break;
			case 3: 
					stcl.editStock(stcl);
					break;
			case 4: 
					stcl.deleteStock(stcl);
					break;
			case 5: 
					stcl.displayAllStock(stcl);
					break;
			case 6: 
					spcl.addNewSupplier(spcl);
					break;
			case 7: 
					spcl.searchSupplier(spcl);
					break;
			case 8: 
					spcl.editSupplier(spcl);
					break;
			case 9: 
					spcl.deleteSupplier(spcl);
					break;
			case 10: 
					spcl.displayAllSupplier(spcl);
					break;
			case 11: 
					pmcl.addNewPayment(pmcl);
					break;
			case 12: 
					pmcl.searchPayment(pmcl);
					break;
			case 13:
					pmcl.displayAllPayment(pmcl);
					break;
			case 14:
					sc.nextInt();
					System.exit(0);
					break;
			default:
					System.out.println("\nEnter correct choice from the list : "); 
					break;	
			}
		}
		while (option !=0); 
		
	}

}
