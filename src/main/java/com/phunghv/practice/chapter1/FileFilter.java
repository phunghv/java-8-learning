package com.phunghv.practice.chapter1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFilter {

    public int countFile(final String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
        return files.length;
    }

    public int filterHiddenFile(final String path) {
        File[] hiddenFiles = new File(path).listFiles(File::isHidden);
        return hiddenFiles.length;
    }

    public int filterHiddenFileNormal(final String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        List<File> result = new ArrayList<File>();
        for (File f : files) {
            if (f.isHidden()) {
                result.add(f);
            }
        }
        return result.size();
    }

    public int countFile1(final String path) {
        File[] files = new File(path).listFiles(this::isFile1);
        for (File f : files) {
            System.out.println("File 1: " + f.getName());
        }
        return files.length;
    }

    public boolean isFile1(final File file) {
        final String name = file.getName();
        if (name.contains("file_1")) {
            return true;
        }
        return false;
    }
}
