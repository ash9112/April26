package a.com;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProREpo  extends JpaRepository<Product , Integer>{

}
