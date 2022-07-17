package com.jgm.springPractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<T>(list);
        Collections.sort(output);
        return output;
    }
}
