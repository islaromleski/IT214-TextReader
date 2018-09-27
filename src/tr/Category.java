/**
 * @author	Matthew Romleski
 * 			Matt Fuller
 * 			Rajeev Nukala
 * 			Thomas Klapperich
 */

package tr;

public class Category {

	private int categoryID = -200000;
	private String categoryName = "N/A";
	private String description = "N/A";
	
	public int getCategoryID() {
		return this.categoryID;
	}
	
	public void setCategoryID(int newCategoryID) {
		this.categoryID = newCategoryID;
	}
	
	public String getCategoryName() {
		return this.categoryName;
	}
	
	public void setCategoryName(String newCategoryName) {
		this.categoryName = newCategoryName;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}
	
	@Override
	public String toString() {
		String aMessage = "";
		aMessage += "Category ID: " + this.getCategoryID() + "\n";
		aMessage += "Category Name: " + this.getCategoryName() + "\n";
		aMessage += "Description: " + this.getDescription() + "\n";
		return aMessage;
	}
	
}
