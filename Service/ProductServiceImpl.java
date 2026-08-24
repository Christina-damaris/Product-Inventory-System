package Service;

import java.util.ArrayList;
import java.util.List;

import Entity.Product;
import Exception.ListEmptyException;
import Exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService {
	 List<Product> allProducts=new ArrayList<>(
			 List.of(new Product(1002,"watch","Electronics",2500.0f,30)
					 ));
	@Override
	public List<Product> getAllProducts() throws ListEmptyException {
		if(!allProducts.isEmpty()) {
			return allProducts;
		}
		throw new ListEmptyException("No elements in the DataBase");
	}

	@Override
	public void searchProduct(int proId) throws ProductNotFoundException,ListEmptyException{
		if(allProducts.isEmpty()) {
			throw new ListEmptyException("No elements in the DataBase");
		}
		for(Product pro:allProducts) {
			if(pro.getProId()==proId) {
				System.out.println(pro);
				return;
			}
		}
		throw new ProductNotFoundException("product not found");
	}
	@Override
	public void addNewProduct(Product newPro) {
		allProducts.add(newPro);
	}

	public boolean check(int n) {
		for(Product pro:allProducts) {
			if(pro.getProId()==n) {
			return true;}
		}
		return false;
	}


	@Override
	public void updateProduct(Product newPro) {

	    if (!check(newPro.getProId())) {
	        System.out.println("Product not found");
	        return;
	    }

	    for (Product pro : allProducts) {

	        if (pro.getProId() == newPro.getProId()) {
	            pro.setName(newPro.getName());
	            pro.setCatogory(newPro.getCatogory());
	            pro.setPrice(newPro.getPrice());
	            pro.setStockCount(newPro.getStockCount());
	        } 
	    }}
	    @Override
	    public void deleteProduct(int proId) {

	        for (int i = 0; i < allProducts.size(); i++) {
	            if (allProducts.get(i).getProId() == proId) {
	                allProducts.remove(i);
	                return;
	            }
	        }
	    }
	

}
