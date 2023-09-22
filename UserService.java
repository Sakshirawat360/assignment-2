package com.geekster.usermanagement.service;


import com.geekster.usermanagement.entity.User;
import com.geekster.usermanagement.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
      return  userRepo.getUsrList();
    }

    public String addUsers(List<User> myUsers) {
        getAllUser().addAll(myUsers);

        return myUsers.size()+"users were added!";
    }
}
