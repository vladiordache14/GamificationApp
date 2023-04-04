package app.gamificationapp.Repo;

import app.gamificationapp.Model.Quest;
import app.gamificationapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestRepository extends JpaRepository<Quest,Long> {

    void deleteQuestById(Long id);
    Optional<Quest> findQuestById(Long id);
}
