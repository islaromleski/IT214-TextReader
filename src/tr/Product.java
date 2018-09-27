/**
 * @author	Matthew Romleski
 * 			Matt Fuller
 * 			Rajeev Nukala
 * 			Thomas Klapperich
 */

package tr;

public class Product {
	
	private int productID = -100000;
	private String productName = "N/A";
	private double unitPrice = -999.99;
	private int categoryID = -200000;
	private int supplierID = -300000;
	
	public int getProductID() {
		return this.productID;
	}
	
	public void setProductID(int newProductID) {
		this.productID = newProductID;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String newProductName) {
		this.productName = newProductName;
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setUnitPrice(double newUnitPrice) {
		this.unitPrice = newUnitPrice;
	}
	
	public int getCategoryID() {
		return this.categoryID;
	}
	
	public void setCategoryID(int newCategoryID) {
		this.categoryID = newCategoryID;
	}
	
	public int getSupplierID() {
		return this.supplierID;
	}
	
	public void setSupplierID(int newSupplierID) {
		this.supplierID = newSupplierID;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += "Product ID: " + this.getProductID() + "\n";
		aMessage += "Product Name: " + this.getProductName() + "\n";
		aMessage += "Unit Price: " + this.getUnitPrice() + "\n";
		aMessage += "Category ID: " + this.getCategoryID() + "\n";
		aMessage += "Supplier ID: " + this.getSupplierID() + "\n";
		return aMessage;
	}
	
}
