package app.gamificationapp.service;

import app.gamificationapp.Exception.QuestNotFoundException;
import app.gamificationapp.Exception.UserNotFoundException;
import app.gamificationapp.Model.Quest;
import app.gamificationapp.Repo.QuestRepository;
import app.gamificationapp.Repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestService {
    public final QuestRepository repository;

    public QuestService(QuestRepository repository) {
        this.repository = repository;
    }

    public Quest addQuest(Quest quest){
        return repository.save(quest);
    }

    public Quest updateQuest(Quest quest){
        return repository.save(quest);
    }

    public void deleteQuest(Long id){
        repository.deleteById(id);
    }

    public List<Quest> findAllQuests(){
        return repository.findAll();
    }

    public Quest findQuestById(Long id){
        return repository.findQuestById(id).orElseThrow(()->new QuestNotFoundException("Quest by id" + id + "was not found") );

    }

}
