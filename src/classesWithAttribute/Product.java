package classesWithAttribute;

public class Product {
	
	public Product(int id, String name, String description, double price, int unitsInstock, String renk) {
		_id=id;
		_name=name;
		_price=price;
		_description=description;
		_unitsInStock=unitsInstock;
		_renk=renk;
	}
	
	public Product() {
		
	}

	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _unitsInStock;
	private String _renk;
	private String _kod;
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String description) {
		_description = description;
	}
	public double getPrice() {
		return _price;
	}
	public void setPrice(double price) {
		_price = price;
	}
	public int getUnitsInStock() {
		return _unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		_unitsInStock = unitsInStock;
	}
	public String getRenk() {
		return _renk;
	}
	public void setRenk(String renk) {
		_renk = renk;
	}
	public String getKod() {
		String subName=_name.substring(0,1);
		_kod=subName+_id;
		return _kod;
	}
	
	

}
