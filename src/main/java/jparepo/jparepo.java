package jparepo;

import datamodel.testdb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jparepo extends JpaRepository<testdb, Integer> {


}
