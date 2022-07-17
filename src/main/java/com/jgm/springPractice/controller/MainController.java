package com.jgm.springPractice.controller;

import com.jgm.springPractice.logic.service.SortService;
import com.sun.tools.javac.Main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService){
        this.sortService = sortService;
    }
    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {
        return sortService.doSort(list).toString();
    }

}
