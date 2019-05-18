package com.asgarie.ClaimSender.service.impl;

import com.asgarie.ClaimSender.entity.User;
import com.asgarie.ClaimSender.service.api.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList = getAllUsers();

    private List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();
        userList.add(new User(0L, "Ali Darvishi"));
        userList.add(new User(1L, "Emad Darvishi"));
        userList.add(new User(2L, "Reza Izadi"));
        userList.add(new User(3L, "Ali Shah"));
        userList.add(new User(4L, "Hossein Shah"));

        return userList;

    }


    @Override
    public User getUser(Long id) {
        return userList.stream()
                .filter(u -> u.getUserId().equals(id))
                .findFirst().get();
    }


}
