package a.com;

import java.util.List;

public interface Proser {
	
	void save (Product pd);
	void modify (Product pd);
	void deleteById (int id);
	Product selectById (int id);
	List<Product> getAllSorted(int sizeSize);
	List<Product>selectAllProduct();
	

}
