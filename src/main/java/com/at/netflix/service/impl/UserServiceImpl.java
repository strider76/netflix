package com.at.netflix.service.impl;

import com.at.netflix.dto.UserPost;
import com.at.netflix.exceptions.UserNotFoundException;
import com.at.netflix.model.User;
import com.at.netflix.repository.UserRepository;
import com.at.netflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(Long idUser) throws UserNotFoundException {
        return userRepository.findById(idUser)
                .orElseThrow(()->new UserNotFoundException(String.format("Usuario no encontrado (%d)",idUser)));
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(UserPost userPost) {
        User userCrear = new User();
        userCrear.setUserName(userPost.getUserName());
        userCrear.setPassword(userPost.getUserPassword());
        return userRepository.save(userCrear);

    }
}
