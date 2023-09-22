package com.geekster.usermanagement.repo;

import com.geekster.usermanagement.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class UserFctory {

    @Bean
    List<User> getUserListInit()
    {
        return new ArrayList<>();
    }
}
