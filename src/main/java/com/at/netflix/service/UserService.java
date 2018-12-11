package com.at.netflix.service;

import com.at.netflix.dto.UserPost;
import com.at.netflix.exceptions.UserNotFoundException;
import com.at.netflix.model.User;

import java.util.List;

public interface UserService {

    User getUser(Long idUser) throws UserNotFoundException;
    List<User> getAll();
    User addUser(UserPost userPost);
}
