package com.asgarie.ClaimSender.batch;

import com.asgarie.ClaimSender.entity.User;
import com.asgarie.ClaimSender.service.api.UserService;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Reader implements ItemReader<User> {

    @Autowired
    private UserService userService;

    @Override
    public User read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        int random = new Random().nextInt(4);
        return userService.getUser((long)random);

    }


}
