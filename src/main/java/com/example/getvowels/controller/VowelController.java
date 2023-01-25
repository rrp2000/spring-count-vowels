package com.example.getvowels.controller;


import com.example.getvowels.service.VowelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VowelController {

    @Autowired
    private VowelService vowelService;

    @GetMapping("/count/{word}")
    public int count(@PathVariable String word){
        return vowelService.countVowels(word);
    }


}
