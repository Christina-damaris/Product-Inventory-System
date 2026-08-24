package Service;

import java.util.List;

import Entity.Product;
import Exception.ListEmptyException;
import Exception.ProductNotFoundException;

public interface ProductService {
	List<Product> getAllProducts() throws ListEmptyException;
	void searchProduct(int proId) throws ProductNotFoundException,ListEmptyException;
	void addNewProduct(Product newPro);
	void updateProduct(Product newPro);
	void deleteProduct(int proId);
	
}
