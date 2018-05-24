package com.phunghv.practice.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileFilterTest {

    private String path = null;
    private static final FileFilter filter = new FileFilter();

    @BeforeEach
    void beforTest() {
        path = this.getClass().getResource("/test_dir").getPath();
    }


    @Test
    @DisplayName("Count files in dir")
    void countFile() {
        int returnVal = filter.countFile(path);
        assertEquals(5, returnVal);
    }

    @Test
    @DisplayName("Filter with ref function")
    void filterHiddenFile() {
        int returnVal = filter.filterHiddenFile(path);
        assertEquals(2, returnVal);
    }

    @Test
    @DisplayName("filter with normal way")
    void filterHiddenFileNormal() {
        int returnVal = filter.filterHiddenFileNormal(path);
        assertEquals(2, returnVal);
    }

    @Test
    void countFile1() {
        int val = filter.countFile1(path);
        assertEquals(2, val);
    }
}