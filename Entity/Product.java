package Entity;

public class Product {
	
	private int proId;
	private String name;
	private String catogory;
	private float price;
	private int stockCount;
	
	public Product(int proId, String name, String catogory, float price, int stockCount) {
		super();
		this.proId = proId;
		this.name = name;
		this.catogory = catogory;
		this.price = price;
		this.stockCount = stockCount;
	}
	
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatogory() {
		return catogory;
	}
	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", name=" + name + ", catogory=" + catogory + ", price=" + price
				+ ", stockCount=" + stockCount + "]";
	}

}
