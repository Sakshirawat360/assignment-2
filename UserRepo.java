package com.geekster.usermanagement.repo;

import com.geekster.usermanagement.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class UserRepo {
    @Autowired
   private List<User> usrList;

    public List<User> getUsrList() {
        return usrList;
    }
}
