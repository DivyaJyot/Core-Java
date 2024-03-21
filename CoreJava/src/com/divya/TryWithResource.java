package com.divya;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryWithResource {
    public static void main2(String[] args) {

        String path = "C:\\Users\\Divya\\Desktop\\Divya\\Learning\\Books\\QuickSort.java";
        long count = readFile(path);
    }
    public static void main(String[] args) throws Exception {
        try (Device d1 = new Device("D1"); Device d2 = new Device("D2")) {
            throw new Exception("test");
            //System.out.println("Inside try");
        }
    }

    public static long readFile(String path) {
        try {

            long count = Files.lines(Paths.get(path)).filter(v -> v.contains("partition")).count();
            System.out.println(count);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally");
        }
        return 5;
    }
}

class Device implements AutoCloseable {
    String header = null;

    public Device(String name) throws IOException {
        header = name;
        if ("D2".equals(name)) throw new IOException("Unknown");
        System.out.println(header + " Opened");
    }

    public String read() throws IOException {
        return "";
    }

    public void close() {
        System.out.println("Closing device " + header);
        throw new RuntimeException("RTE while closing " + header);
    }


}