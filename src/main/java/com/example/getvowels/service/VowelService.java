package com.example.getvowels.service;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VowelService {

    public int countVowels(String word){
        int count = 0;

        for(int i = 0; i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                count++;
            }
        }

        return count;
    }

}
