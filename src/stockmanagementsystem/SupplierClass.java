package stockmanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class SupplierClass 
{
	int sup_id;
	String sup_name;
	int contact_num;
	String email_id;
	String place;
	
	//getters n setters
	
	public int getSup_id() {
		return sup_id;
	}

	public void setSup_id(int sup_id) {
		this.sup_id = sup_id;
	}

	public String getSup_name() {
		return sup_name;
	}

	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}

	public int getContact_num() {
		return contact_num;
	}

	public void setContact_num(int contact_num) {
		this.contact_num = contact_num;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	//Parameterized constructor
	public SupplierClass(int sup_id, String sup_name, int contact_num, String email_id, String place) 
	{
		this.sup_id = sup_id;
		this.sup_name = sup_name;
		this.contact_num = contact_num;
		this.email_id = email_id;
		this.place = place;
	}
	//default constructor
	public SupplierClass() 
	{
		super();
	}

	//toString method
	@Override
	public String toString() 
	{
		return "\nSupplier Details : " + "\nSupplier ID : "+this.sup_id +"\nSupplier Name : "+this.sup_name +"\nSupplier Contact : "+
	            this.contact_num +"\nSupplier email : "+this.email_id +"\nSupplier Place : "+this.place;
	}
	
	static void displaySupplier(ArrayList<SupplierClass>a2)
	{
		System.out.println("\n--------------------------SUPPLIER LIST-------------------------------\n");
		System.out.println(String.format("%-10s%-15s%-15s%-15s%-15s", "Sup_ID","Sup_Name","Sup_Contact","Sup_email","Sup_place"));
		for(SupplierClass su : a2)
		{
			System.out.println(String.format("%-10s%-15s%-15s%-15s%-15s", su.sup_id,su.sup_name,su.contact_num,su.email_id,su.place));
		}
	}

	Scanner sc = new Scanner(System.in);
	ArrayList <SupplierClass> a2=new ArrayList <SupplierClass>();
	
	public void addNewSupplier(SupplierClass spcl )
	{
		
		
		System.out.println("\n Enter the following details : ");
		System.out.println("Enter Supplier ID : ");
		sup_id=sc.nextInt();
		System.out.println("Enter Supplier name : ");
		sup_name=sc.next();
		System.out.println("Enter Supplier Contact number : ");
		contact_num=sc.nextInt();
		System.out.println("Enter Supplier email ID");
		email_id=sc.next();
		System.out.println("Enter Supplier Place");
		place=sc.next();
		

			a2.add(new SupplierClass(sup_id, sup_name, contact_num, email_id, place));
		
	}
	public void searchSupplier(SupplierClass spcl )
	{
		System.out.println("Enter the Supplier ID to search : ");
		sup_id=sc.nextInt();
		int i=0;
		for(SupplierClass sp :a2)
		{
			if(sup_id==sp.sup_id)
			{
				System.out.println(sp + "\n");
				i++;
			}
		}
		if(i==0)
		{
			System.out.println(("\n Supplier details not found. Enter valid ID! "));
		}
	}
	
	public void editSupplier(SupplierClass spcl)
	{
		System.out.println("\nEnter the supplier ID to edit the details : ");
		sup_id=sc.nextInt();
		int j=0;
		for(SupplierClass sp:a2)
		{
			if(sup_id==sp.sup_id)
			{
				j++;
			do
			{
				int ch1 = 0;
				System.out.println("\nEdit Supplier Details : \n" +
									"1. Supplier ID\n"+
									"2. Supplier Name\n"+
									"3. Contact number\n"+
									"4. Email ID\n"+
									"5. Place\n"+
									"6. GO BACK\n");
				System.out.println("Enter your choice : ");
				ch1=sc.nextInt();
				switch(ch1)
				{
				case 1: System.out.println("\nEnter new supplier ID : ");
						sp.sup_id=sc.nextInt();
						System.out.println(sp+"\n");
						break;
						
				case 2: System.out.println("\nEnter new supplier name : ");
						sc.nextLine();
						sp.sup_name=sc.nextLine();
						System.out.println(sp+"\n");
						break;
				
				case 3: System.out.println("\nEnter new contact number : ");
						sc.nextInt();
						sp.contact_num=sc.nextInt();
						System.out.println(sp+"\n");
						break;
				
				case 4: System.out.println("\nEnter new email ID : ");
						sp.email_id=sc.nextLine();
						System.out.println(sp+"\n");
						break;
						
				case 5: System.out.println("\nEnter new place : ");
						sp.place=sc.nextLine();
						System.out.println(sp+"\n");
						break;
						
				case 6: j++;
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

	public void deleteSupplier(SupplierClass spcl)
	{	
		System.out.println("Enter the Supplier ID to delete : ");
		sup_id=sc.nextInt();
		int k=0;
		try
		{
			for(SupplierClass sp:a2)
			{
				if(sup_id==sp.sup_id)
				{
					a2.remove(sp);
					displaySupplier(a2);
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

	public void displayAllSupplier(SupplierClass spcl)
	{	
		displaySupplier(a2);
	}

	
}
