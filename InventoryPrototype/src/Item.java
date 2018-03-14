
public class Item {
	
	public String name = "";
	public String productNum = "";
	public String category = "";
	public String specialOrder = "";
	
	//Sets item name
	public void setName(String newName) {
		this.name = newName;
	}
	
	//Sets item number. In the future, it might just do this from the lookup table by name.
	//May be a good idea to give user option to enter either name or product number and have a search function.
	public void setProductNum(String newProductNum) {
		this.productNum = newProductNum;
	}
	
	public String searchTable(String name, String productNum) {
		//In the future, have code here that references a table of items and product numbers and 
		//returns a string of whatever the missing info is.
		return null;
	}
	
	//Sets new catagory. Categories include things like wholesale,retail,shipper,etc
	public void setCategory(String newCategory) {
		this.category = newCategory;
	}
	
	//Special order is for stuff like wedding cakes with specific names attached. 
	//Could also be used for shipping I guess.
	public void setSpecialOrder(String newSpecialOrder) {
		this.specialOrder = newSpecialOrder;
	}
	
	//RETURN METHODS BELOW THIS LINE
	
	//Returns item name
	public String getName() {
		return name;
	}
	
	public String getProductNum() {
		return productNum;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getSpecialOrder() {
		return specialOrder;
	}
	

}
