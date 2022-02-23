package stockmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class StockClass 
{
	int stock_id;
	String stock_name;
	String stock_type;
	float stock_price;
	
	//getters and setters
	
	public int getStock_id() {
		return stock_id;
	}


	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}


	public String getStock_name() {
		return stock_name;
	}


	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}


	public String getStock_type() {
		return stock_type;
	}


	public void setStock_type(String stock_type) {
		this.stock_type = stock_type;
	}


	public float getStock_price() {
		return stock_price;
	}


	public void setStock_price(float stock_price) {
		this.stock_price = stock_price;
	}

	//default constructor
		public StockClass() 
		{
			super();
		}
		
	//parameterized constructor
	public StockClass(int stock_id, String stock_name, String stock_type, float stock_price) 
	{
		this.stock_id = stock_id;
		this.stock_name = stock_name;
		this.stock_type = stock_type;
		this.stock_price = stock_price;
	}
	


//toString method
	@Override
	public String toString() 
	{
		return "\nSTOCK DETAILS : " + "\n\nStock ID :  "+this.stock_id +"\nStock Name :  "+this.stock_name +"\nStock Type :  "+
	            this.stock_type +"\nStock Price : "+this.stock_price;	
	}
	
	static void displayStock(ArrayList<StockClass>a1)
	{
		System.out.println("\n-----------------STOCK LIST-----------------\n");
		System.out.println(String.format("%-15s%-15s%-15s%-15s", "STOCK ID","STOCK NAME","STOCK TYPE","STOCK PRICE"));
		System.out.println();
		for(StockClass st : a1)
		{
			System.out.println(String.format("%-15s%-15s%-15s%-15s", st.getStock_id(),st.getStock_name(),st.getStock_type(),st.getStock_price()));
		}
	}
	
	Scanner sc = new Scanner(System.in);
	ArrayList <StockClass> a1=new ArrayList <StockClass>();
	
	public void addNewStock(StockClass stcl ) 
	{
		
		
		System.out.println("\n Enter the following details : ");
		System.out.println("Enter Stock ID : ");
		stock_id=sc.nextInt();
		System.out.println("Enter Stock name : ");
		stock_name=sc.next();
		System.out.println("Enter Stock Type : ");
		stock_type=sc.next();
		System.out.println("Enter Stock Price");
		stock_price=sc.nextFloat();
		
		
		a1.add(new StockClass(stock_id,stock_name,stock_type,stock_price));
		displayStock(a1);
		
	}
	
	public void searchStock(StockClass stcl )
	{
		System.out.println("Enter the Stock ID to search : ");
		stock_id=sc.nextInt();
		int i=0;
		for(StockClass s:a1)
		{
			if(stock_id==s.stock_id)
			{
				System.out.println(s + "\n");
				i++;
			}
		}
		if(i==0)
		{
			System.out.println(("\n Stock details not found. Enter valid ID! "));
		}
	}
	
	public void editStock(StockClass stcl)
	{
		System.out.println("\nEnter the stock ID to edit the details : ");
		stock_id=sc.nextInt();
		int j=0;
		for(StockClass s:a1)
		{
			if(stock_id==s.stock_id)
			{
				j++;
			do
			{
				int ch1 = 0;
				System.out.println("\nEdit Stock Details : \n" +
									"1. Stock ID\n"+
									"2. Stock Name\n"+
									"3. Stock Type\n"+
									"4. Stock Price\n"+
									"5. Go Back\n");
				System.out.println("Enter your choice : ");
				ch1=sc.nextInt();
				switch(ch1)
				{
				case 1: System.out.println("\nEnter new stock ID : ");
						s.stock_id=sc.nextInt();
						System.out.println(s+"\n");
						break;
						
				case 2: System.out.println("\nEnter new stock name : ");
						sc.nextLine();
						s.stock_name=sc.nextLine();
						System.out.println(s+"\n");
						break;
				
				case 3: System.out.println("\nEnter new stock type : ");
						sc.nextLine();
						s.stock_type=sc.nextLine();
						System.out.println(s+"\n");
						break;
				
				case 4: System.out.println("\nEnter new stock price : ");
						s.stock_price=sc.nextFloat();
						System.out.println(s+"\n");
						break;
						
				case 5: j++;
						break;
						
				default:System.out.println("\nEnter the correct choice from the list!!");
						break;
				}
			}
			while(j==1);
			}
		}
		if(j==0)
		{
			System.out.println("\n Stock details are not available! Enter valid ID!!");
		}
	}

	public void deleteStock(StockClass stcl)
	{	
		System.out.println("Enter the Stock ID to delete : ");
		stock_id=sc.nextInt();
		int k=0;
		try
		{
			for(StockClass s:a1)
			{
				if(stock_id==s.stock_id)
				{
					a1.remove(s);
					displayStock(a1);
					k++;
				}
			}
			if(k==0)
			{
				System.out.println("\nStock details not available! enter valid ID!");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

	public void displayAllStock(StockClass stcl)
	{	
		displayStock(a1);
	}

}
