package ac.in.erp.admission_module.repository;

import ac.in.erp.admission_module.model.StudentManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudManagerRepo extends JpaRepository<StudentManager,Long> {
}
