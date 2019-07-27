package hh.test.demojpa.controllers;

import hh.test.demojpa.models.User;
import hh.test.demojpa.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/srv")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Iterable<User> GetAllUser(){
        Iterable<User> otvet = null;
        otvet = userRepository.findAll();
        return otvet;
    }

    @PostMapping(value = "/save")
    public User NewUser(@RequestBody final User user){
        return userRepository.save(user);
    }
}
