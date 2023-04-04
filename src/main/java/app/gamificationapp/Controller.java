package app.gamificationapp;

import app.gamificationapp.Model.Quest;
import app.gamificationapp.Model.User;
import app.gamificationapp.service.QuestService;
import app.gamificationapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    private final UserService userService;
    private final QuestService questService;

    @Autowired
    public Controller(UserService userService, QuestService questService) {
        this.userService = userService;
        this.questService = questService;
    }

    @GetMapping("/user/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/user/find/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @PostMapping("/user/add")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser,HttpStatus.CREATED);
    }

    @DeleteMapping("/user/delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        System.out.println("element deleted successfully");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/user/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){

        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser,HttpStatus.CREATED);
    }

    @GetMapping("/quest/all")
    public ResponseEntity<List<Quest>> getAllQuests(){
        List<Quest> quests = questService.findAllQuests();
        return new ResponseEntity<>(quests,HttpStatus.OK);
    }

    @GetMapping("/quest/find{id}")
    public ResponseEntity<Quest> findQuestById(@PathVariable("id") Long id){
        Quest quest = questService.findQuestById(id);
        return new ResponseEntity<>(quest,HttpStatus.OK);
    }

    @PostMapping("/quest/add")
    public ResponseEntity<Quest> addQuest(@RequestBody Quest quest){
        Quest newQuest = questService.addQuest(quest);
        return new ResponseEntity<>(newQuest,HttpStatus.CREATED);
    }

    @DeleteMapping("/quest/delete{id}")
    public ResponseEntity<Quest> deleteQuest(@PathVariable("id") Long id){
        questService.deleteQuest(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/quest/update")
    public ResponseEntity<Quest> updateQuest(@RequestBody Quest quest){
        Quest updateQuest = questService.updateQuest(quest);
        return new ResponseEntity<>(updateQuest,HttpStatus.CREATED);
    }



}
