package stockmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;
public class PaymentClass 
{
	int stock_id;
	int sup_id;
	float amount;
	String date;
	String mode_of_payment;
	
	
	//getters n setters
	public int getStock_id() {
		return stock_id;
	}

	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}

	public int getSup_id() {
		return sup_id;
	}

	public void setSup_id(int sup_id) {
		this.sup_id = sup_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMode_of_payment() {
		return mode_of_payment;
	}

	public void setMode_of_payment(String mode_of_payment) {
		this.mode_of_payment = mode_of_payment;
	}

//parameterized constructor
	public PaymentClass(int stock_id, int sup_id, float amount, String date, String mode_of_payment) 
	{
		StockClass stcl =new StockClass();
		SupplierClass spcl=new SupplierClass();
		
		this.stock_id=stock_id;
		this.sup_id = sup_id;
		this.amount = amount;
		this.date = date;
		this.mode_of_payment = mode_of_payment;
	}
	//default constructor
	public PaymentClass() 
	{
		super();
	}
	//toString method
	@Override
	public String toString() 
	{
		return  "\nPayment Details : " + "\nStock ID : "+ this.getStock_id() +"\nSupplier ID : "+this.sup_id +"\nAmount : "+
	            this.getAmount() +"\nDate : "+this.getDate()+"\nMode of Payment : "+ this.getMode_of_payment();
	}
	
	static void displayPayment(ArrayList<PaymentClass>a3)
	{
		System.out.println("\n-----------------PAYMENT LIST-----------------\n");
		System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", "Stock ID","Supplier ID","Amount","Date","Mode of Payment"));
		for(PaymentClass pa : a3)
		{
			System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", pa.getStock_id(),pa.getSup_id(),pa.getAmount(),pa.getDate(),pa.getMode_of_payment()));
		}
	}
	
	Scanner sc = new Scanner(System.in);
	ArrayList <PaymentClass> a3=new ArrayList <PaymentClass>();
	
	public void addNewPayment(PaymentClass pmcl ) 
	{
		
		
		System.out.println("\n Enter the following details : ");
		System.out.println("Enter Stock ID : ");
		stock_id=sc.nextInt();
		System.out.println("Enter Supplier ID : ");
		sup_id=sc.nextInt();
		System.out.println("Enter the Amount : ");
		amount=sc.nextFloat();
		System.out.println("Enter Date of Transaction : ");
		sc.nextLine();
		date=sc.next();
		System.out.println("Enter Mode of Payment : ");
		sc.nextLine();
		mode_of_payment=sc.next();
		
		
				a3.add(new PaymentClass(stock_id, sup_id, amount, date, mode_of_payment));
			
		
		displayPayment(a3);
	}
	
	public void searchPayment(PaymentClass pmcl ) 
	{
		System.out.println("Enter the Supplier ID to search : ");
		sup_id=sc.nextInt();
		int i=0;
		for(PaymentClass pm :a3)
		{
			if(sup_id==pm.sup_id)
			{
				System.out.println(pm + "\n");
				i++;
			}
		}
		if(i==0)
		{
			System.out.println(("\n Payment details not found. Enter valid ID! "));
		}
	}
	
	public void displayAllPayment(PaymentClass pmcl)
	{	
		displayPayment(a3);
	}
}
