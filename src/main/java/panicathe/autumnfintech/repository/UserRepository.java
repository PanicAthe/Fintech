package panicathe.autumnfintech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import panicathe.autumnfintech.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    //int countAccountsById(Long id);

    Optional<User> findByEmail(String email);

    boolean existsByUsername(String username);
}
