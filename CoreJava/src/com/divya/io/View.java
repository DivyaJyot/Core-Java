package com.divya.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class View {


    public static void main(String[] args) {
        Path src = Path.of("C:\\Users\\Divya\\Desktop\\Code\\Projects_Divya\\Core-Java\\CoreJava\\bin\\multithreading\\Thread1.class");
        try {
            Files.isHidden(src);

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void checkAttribute(Path path) throws IOException {
        BasicFileAttributes bsa=Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("-----------path is -------------" + path);
        System.out.println("Files.isExecutable(path)" + bsa.isDirectory());
        System.out.println("Files.isReadable(path)" + bsa.isRegularFile());
        System.out.println("Files.isWritable(path)" + bsa.isSymbolicLink());
    }
}