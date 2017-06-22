package com.probando.algo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@EntityScan
@EnableJpaRepositories
@RestController
@RequestMapping("user")
public class UserController {

    private final UserRepository userRepository ;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping (value = "/save" , method= RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser (@Valid @RequestBody UserDTO userDTO, BindingResult bindingResult) throws BindException {
        if (bindingResult.hasErrors()){
            throw new BindException(bindingResult);
        }
        else {
            return userRepository.save(userDTO.toUser());

        }
    }

    @RequestMapping (value="/getAll" , method = RequestMethod.GET)
    public List<User> getAllUsers (){
        return userRepository.findAll();
    }

    @RequestMapping (value="/getById/{userId}" , method = RequestMethod.GET)
    public User getById (@PathVariable Long userId){
        return userRepository.findById(userId);
    }


}


