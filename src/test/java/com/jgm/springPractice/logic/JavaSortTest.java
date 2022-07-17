package com.jgm.springPractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    @DisplayName("자바솔트 - 리스트를 넣으면 정렬한 결과가 나온다.")
    void sort() {
        JavaSort<Integer> javaSort = new JavaSort<Integer>();
        List<Integer> actual = javaSort.sort(List.of(3,2,4,5,1));
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}