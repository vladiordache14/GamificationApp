package app.gamificationapp.service;

import app.gamificationapp.Exception.UserNotFoundException;
import app.gamificationapp.Model.User;
import app.gamificationapp.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public final UserRepository repository;



    @Autowired //dependency injection
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User addUser(User user){
        return repository.save(user);
    }

    public List<User> findAllUsers(){
        return repository.findAll();
    }

    public void deleteUser(Long id){
        repository.deleteUserById(id);
    }

    public User updateUser(User user){
        return repository.save(user);
    }
    public User findUserById(Long id)  {
        return repository.findUserById(id).orElseThrow(()->new UserNotFoundException("User by id" + id + "was not found") );
    }

}
