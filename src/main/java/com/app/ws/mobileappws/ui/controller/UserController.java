/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ws.mobileappws.ui.controller;

import com.app.ws.mobileappws.service.UserService;
import com.app.ws.mobileappws.sheared.dto.UserDto;
import com.app.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.app.ws.mobileappws.ui.model.response.UserRes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arun
 */
@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping(path ="/{id}")
    public UserRes getUsers(@PathVariable String id){
        UserRes returnValue= new UserRes();
        UserDto userDto=userService.getUserByUserId(id);
        BeanUtils.copyProperties(userDto, returnValue);
        return returnValue;
    }
    
    @PostMapping
    public UserRes createUser(@RequestBody UserDetailsRequestModel userDetails){
        
        UserRes returnValue= new UserRes();
        UserDto userDto= new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);
        UserDto createdUser=userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);
        return returnValue;
    }
    
    @PutMapping
    public String updateUser(){
        return "update user was called";
    }
    
    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
    
}
