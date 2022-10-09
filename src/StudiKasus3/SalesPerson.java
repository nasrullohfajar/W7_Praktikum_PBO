package StudiKasus3;

public class SalesPerson implements Comparable{

	private String firstName, lastName;
	private int totalSales;
	
	public SalesPerson(String first, String last, int sales) {
		super();
		this.firstName = first;
		this.lastName = last;
		this.totalSales = sales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + ": \t" + totalSales;
	}
	
	public boolean equals (Object other) {
		return (lastName.equals(((SalesPerson)other).getLastName())
				&& firstName.equals(((SalesPerson)other).getFirstName()));
	}
	
	public int compareTo(Object other) {
		int result = 0;
		SalesPerson eb = (SalesPerson) other;
		if(totalSales<eb.totalSales) result =  -1;
		if(totalSales>eb.totalSales) result = +1;
		return result;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSales() {
		return totalSales;
	}
}
