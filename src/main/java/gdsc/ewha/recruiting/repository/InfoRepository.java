package gdsc.ewha.recruiting.repository;

import gdsc.ewha.recruiting.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Integer> {

}
