package com.geekster.usermanagement.controller;

import com.geekster.usermanagement.entity.User;
import com.geekster.usermanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Validated
public class UserController {

@Autowired
    UserService userService;


@GetMapping("users")
 public List<User> getAllUser()
   {
      return userService.getAllUser();
   }
   @PostMapping("users")
   public String addUsers(@RequestBody @Valid List<User> myUsers)
   {
       return userService.addUsers(myUsers);
   }
}