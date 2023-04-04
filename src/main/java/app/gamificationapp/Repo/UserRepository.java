package app.gamificationapp.Repo;

import app.gamificationapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    void deleteUserById(Long id);
    Optional<User> findUserById(Long id);
}
