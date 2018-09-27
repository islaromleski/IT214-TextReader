/**
 * @author	Matthew Romleski
 * 			Matt Fuller
 * 			Rajeev Nukala
 * 			Thomas Klapperich
 */

package tr;

import java.util.ArrayList;
import java.util.List;

import tr.ConsoleView;
import tr.TextConnection;

public class MainController {

	public static void main(String[] args) {
		
		ConsoleView aView = new ConsoleView();
		TextConnection aTextConnection = new TextConnection();

		List<String> categoryFile = new ArrayList<String>();
		List<String> supplierFile = new ArrayList<String>();
		List<String> productFile = new ArrayList<String>();

		categoryFile = aTextConnection.getFile("C:\\Users\\mroml\\Documents\\Coding Projects\\Java\\TextReader", "Categories.csv");
		supplierFile = aTextConnection.getFile("C:\\Users\\mroml\\Documents\\Coding Projects\\Java\\TextReader", "Suppliers.csv");
		productFile = aTextConnection.getFile("C:\\Users\\mroml\\Documents\\Coding Projects\\Java\\TextReader", "Products.csv");

		List<Category> listOfCategories = new ArrayList<Category>();
		Category aCategory = null;
		List<Supplier> listOfSuppliers = new ArrayList<Supplier>();
		Supplier aSupplier = null;
		List<Product> listOfProducts = new ArrayList<Product>();
		Product aProduct = null;
		
		String[] categoryStrings = null;
		
		for (String s : (categoryFile)) {
			categoryStrings = s.split(";");
			aCategory = new Category();
			aCategory.setCategoryID(Integer.parseInt(categoryStrings[0]));
			aCategory.setCategoryName(categoryStrings[1]);
			aCategory.setDescription(categoryStrings[2]);
			listOfCategories.add(aCategory);
		}
		
		String[] supplierStrings = null;

		for (String s : (supplierFile)) {
			supplierStrings = s.split(";");
			aSupplier = new Supplier();
			aSupplier.setSupplierID(Integer.parseInt(supplierStrings[0]));
			aSupplier.setCompanyName(supplierStrings[1]);
			aSupplier.setStreet(supplierStrings[2]);
			aSupplier.setCity(supplierStrings[2]);
			aSupplier.setCountry(supplierStrings[2]);
			listOfSuppliers.add(aSupplier);
		}
		
		String[] productStrings = null;
		
		for (String s : (productFile)) {
			productStrings = s.split(",");
			aProduct = new Product();
			aProduct.setProductID(Integer.parseInt(productStrings[0]));
			aProduct.setProductName(productStrings[1]);
			aProduct.setUnitPrice(Double.parseDouble(productStrings[2]));
			aProduct.setCategoryID(Integer.parseInt(productStrings[3]));
			aProduct.setSupplierID(Integer.parseInt(productStrings[4]));
			listOfProducts.add(aProduct);
		}

		for (Category s : listOfCategories) {
			aView.print(s.toString());
		}

		for (Supplier s : listOfSuppliers) {
			aView.print(s.toString());
		}

		for (Product s : listOfProducts) {
			aView.print(s.toString());
		}
		
	}

}
