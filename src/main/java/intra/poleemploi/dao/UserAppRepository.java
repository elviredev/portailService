package intra.poleemploi.dao;

import intra.poleemploi.entities.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface UserAppRepository extends JpaRepository<UserApp, Long> {
    UserApp findUserByUsername(String username);
    UserApp findUserById(Long id);
}
