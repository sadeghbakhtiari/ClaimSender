package com.asgarie.ClaimSender.batch;

import com.asgarie.ClaimSender.entity.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<User, User> {

    @Override
    public User process(User user) throws Exception {
        System.out.println("In Processor : " + user.toString());
        return user;
    }

}
