/**
 * @author	Matthew Romleski
 * 			Matt Fuller
 * 			Rajeev Nukala
 * 			Thomas Klapperich
 */

package tr;

public class Supplier {
	
	private int supplierID = -300000;
	private String companyName = "N/A";
	private String street = "N/A";
	private String city = "N/A";
	private String country = "N/A";
	
	public int getSupplierID() {
		return this.supplierID;
	}
	
	public void setSupplierID(int newSupplierID) {
		this.supplierID = newSupplierID;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public void setCompanyName(String newCompanyName) {
		this.companyName = newCompanyName;
	}

	public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String newStreet) {
		this.street = newStreet;
	}

	public String getCity() {
		return this.city;
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}

	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String newCountry) {
		this.country = newCountry;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += "Supplier ID: " + this.getSupplierID() + "\n";
		aMessage += "Company Name: " + this.getCompanyName() + "\n";
		aMessage += "Street: " + this.getStreet() + "\n";
		aMessage += "City: " + this.getCity() + "\n";
		aMessage += "Country: " + this.getCountry() + "\n";
		return aMessage;
	}
	
}
