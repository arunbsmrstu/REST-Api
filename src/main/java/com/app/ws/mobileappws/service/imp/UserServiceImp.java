/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ws.mobileappws.service.imp;

import com.app.ws.mobileappws.dao.UserRepository;
import com.app.ws.mobileappws.entity.UserEntity;
import com.app.ws.mobileappws.service.UserService;
import com.app.ws.mobileappws.sheared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Arun
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userEntity.setEncryptedPassword("test");
        userEntity.setUserId("testUserId1");
        UserEntity storUserDetails =userRepository.save(userEntity);
        UserDto returnValue=new UserDto();
         BeanUtils.copyProperties(storUserDetails, returnValue);
        return returnValue;
    }

}
