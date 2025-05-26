package com.main;

public class Manufacture {
	private String manufacturename;
	private String manufactureaddress;
	private  String registationnumber;
	
	
	private Manufacture( String manufacturename, String  manufactureaddress, String manufacturenumber) {
		this.manufacturename=manufacturename;
		this.manufactureaddress=manufactureaddress;
		this.registationnumber=registationnumber;
	}
	public void setmanufacturename(String manufacturename) {
		this.manufacturename=manufacturename;
		}
	public void setmanufactureaddress(String manufacture) {
		this.manufactureaddress=manufactureaddress;
	}
	public void setregistationnumber(String registationnumber) {
		this.registationnumber=registationnumber;
	}
	public String getmanufacturename() {
		return manufacturename;
	}
	public String getmanufactureaddress() {
		return manufactureaddress;
	}
	public String getregistationnumber() {
		return registationnumber;
	}
	public static Manufacture getmanufactureobject( String manufacturename,String manufactureaddress,String manufacturenumber){
		if (registrationNumber == null || registrationNumber.length() != 10) {
			return null;
		}
	return new Manufacture(manufacturename,manufactureaddress,manufacturenumber);
		}
	public String toString() {
		return"manufacturename:"+manufacturename"manufactureaddress:"+manufactureaddress"registationnumber:"+registationnumber;
		
	}
	
package com.main;

public class Product {
private String productname;
private String category;
private Manufacture manufacture;
private double price;
private Product(String productname, String catagory,Manufacture manufacture,double price) {
	this.productname=productname;
	this.category=category;
	this.manufacture=manufacture;
	this.price=price;
	
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Manufacture getManufacture() {
	return manufacture;
}
public void setManufacture(Manufacture manufacture) {
	this.manufacture = manufacture;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public static Product getProductObject(String productName, String category, Manufacturer manufacturer, double price) {
	if (manufacturer == null || price <= 0) {
		return null;
	}
	return new Product(productName, category, manufacturer, price);
}


}  
   package com.main;

	import com.manufacturer.Manufacturer;
	import com.product.Product;
	public class Main3 {
		public static void main(String[] args) {
			
			 Manufacturer manufacturer = Manufacturer.getManufacturerObject("Global Tech", "789 Industry Zone", "REG1234567");

		        if (manufacturer == null) {
		            System.out.println("Invalid manufacturer information.");
		        } else {
		            System.out.println(manufacturer);
		        }

		        
		        Product product = Product.getProductObject("SmartWatch X", "Electronics", manufacturer, 249.99);

		        if (product == null) {
		            System.out.println("Invalid product information.");
		        } else {
		            System.out.println("\nProduct Details:");
		            System.out.println(product);
		        }
		}


