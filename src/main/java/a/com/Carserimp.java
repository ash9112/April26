package a.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Carserimp implements Catser{
	
	@Autowired
	 private Catser cs;

	@Override
	public void save(Category ct) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void modify(Category ct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllSorted(int sizeSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> selectAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

}
