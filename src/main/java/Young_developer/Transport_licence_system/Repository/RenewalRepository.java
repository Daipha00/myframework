package Young_developer.Transport_licence_system.Repository;

import Young_developer.Transport_licence_system.Model.Renewal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenewalRepository extends JpaRepository<Renewal,Long> {

}

