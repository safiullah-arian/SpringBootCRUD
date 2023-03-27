package Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import entity.student;
public interface StudentRepository extends JpaRepository<student,Integer> {
	student findByName(String name);
}
