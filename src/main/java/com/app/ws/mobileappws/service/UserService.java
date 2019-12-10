/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ws.mobileappws.service;

import com.app.ws.mobileappws.sheared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Arun
 */
public interface UserService extends UserDetailsService{
    public UserDto createUser(UserDto user);
    public UserDto getUser(String email);
    public UserDto getUserByUserId(String id);
}
