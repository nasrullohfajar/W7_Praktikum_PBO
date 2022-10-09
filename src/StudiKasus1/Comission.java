package StudiKasus1;

public class Comission extends Hourly  {
	
	private double total_sales;
	private double comission_rate;
	
	public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comission_rate) {
		
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.comission_rate = comission_rate;
	}
	
	public void addSales(double totalSales) {
		
		this.total_sales = totalSales;
	}
	
	public double pay() {
		
		double payment = super.pay() + (total_sales * comission_rate);
		total_sales = 0;
		return payment;
	}
	
	public String toString() {
		
		String result = super.toString();
		result += "\nTotal Sales: " + total_sales;
		return result;
	}
}
