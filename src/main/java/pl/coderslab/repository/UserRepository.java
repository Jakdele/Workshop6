package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findFirstByUsername(String username);

    User findFirstByEmail(String email);
}
