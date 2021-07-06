package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class animalNoises {


    HashMap<String, String> dict = new HashMap<>();

    public String getFromDict(String key){
        return dict.getOrDefault(key, "Invalid key!");


    }

    public animalNoises(){
        // Populate the dictionary
        dict.put("dog", "woof");
        dict.put("cat", "meow");
        dict.put("sheep","baa");
    }
}
