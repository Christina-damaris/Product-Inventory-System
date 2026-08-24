import java.util.Scanner;

import Entity.Product;
import Exception.ListEmptyException;
import Exception.ProductNotFoundException;
import Service.ProductServiceImpl;

public class ProductInventorySystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductServiceImpl service=new ProductServiceImpl();
		int ch;
		do {
			System.out.println("1.Show All Producte\n2.Search Product\n3.Add Product\n4.Update product\n5.Delete Product\n6.Exit");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				try {
					for(Product pro:service.getAllProducts()) {
						System.out.println(pro);
					}
				} catch (ListEmptyException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Type product ID :");
				int proId=sc.nextInt();
				try {
					try {
						service.searchProduct(proId);
					} catch (ListEmptyException e) {
						System.out.println(e.getMessage());
					}
				} catch (ProductNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter proId :");
				int id=sc.nextInt();
				System.out.println("Type product name :");
				String name=sc.next();
				System.out.println("Type product catogory :");
				String catogory=sc.next();
				System.out.println("Type product price :");
				float price=sc.nextFloat();
				System.out.println("Type product quantity :");
				int stock=sc.nextInt();
				service.addNewProduct(new Product(id, name, catogory, price, stock));
				break;
			case 4:
				System.out.println("Enter Product ID :");
				int idd=sc.nextInt();
				if(service.check(idd)) {
					System.out.println("Type product name :");
					String name1=sc.next();
					System.out.println("Type product catogory :");
					String catogory1=sc.next();
					System.out.println("Type product price :");
					float price1=sc.nextFloat();
					System.out.println("Type product quantity :");
					int stock1=sc.nextInt();
					service.updateProduct(new Product(idd,name1,catogory1,price1,stock1));
					break;
				}
				else {
					System.out.println("Product not found");
				}
			case 5:
				System.out.println("Enter ProId to delete :");
				int proI=sc.nextInt();
				service.deleteProduct(proI);
				System.out.println("Product deleted successfully..");
				break;
			case 6:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("INVALID INPUT...");
			}
			
		}while(ch!=6);
		
		System.out.println("===============================");

	}

}
