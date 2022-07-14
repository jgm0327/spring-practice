package com.jgm.javaoop.logic.service;

import com.jgm.javaoop.logic.JavaSort;
import com.jgm.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
