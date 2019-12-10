/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ws.mobileappws.utils;

import java.security.SecureRandom;
import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author Arun
 */
@Component
public class Utils {
    private final Random RANDOM= new SecureRandom();
    private final String ALPHABET="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    
    public String generatedUserId(int length){
        return generateRandomString(length);
    }
    
    private String generateRandomString(int length){
        StringBuilder reaturnValue= new StringBuilder(length);
        
        for(int i=0;i<length;i++){
            reaturnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        
        return new String(reaturnValue);
    }
}
