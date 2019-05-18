package com.asgarie.ClaimSender.batch;

import com.asgarie.ClaimSender.entity.User;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Override
    public void write(List<? extends User> list) throws Exception {
        System.out.println("In Write : " + list.get(0));
    }

}
