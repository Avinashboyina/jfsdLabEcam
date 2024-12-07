package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class BookRepository {
	

	

	@Repository
	public interface BookRepository extends JpaRepository<Book, Long> {
	}


}
