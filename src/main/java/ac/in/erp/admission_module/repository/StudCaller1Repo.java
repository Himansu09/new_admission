package ac.in.erp.admission_module.repository;

import ac.in.erp.admission_module.model.StudCaller1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudCaller1Repo extends JpaRepository<StudCaller1,Long> {
}
