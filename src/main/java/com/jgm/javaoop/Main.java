package com.jgm.javaoop;

import com.jgm.javaoop.logic.BubbleSort;
import com.jgm.javaoop.logic.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}