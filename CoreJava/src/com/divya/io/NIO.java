package com.divya.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NIO {


   public static void main(String[] args) {
      NIO nio= new NIO();
      nio.copyFile();

   }

   public void copyFile(){
      Path src= Path.of("C:\\Users\\Divya\\Desktop\\Cycling journey_Shakti.docx");
      Path target=Path.of("C:\\Users\\Divya\\Desktop\\Shakti\\abc.docx");
      Path classFile=Path.of("C:\\Users\\Divya\\Desktop\\Code\\Projects_Divya\\Core-Java\\CoreJava\\bin\\multithreading\\Thread1.class");
      Path src1= Paths.get("C:\\Program Files\\Java\\jdk-17\\lib\\ct.sym");
      Path target1=Paths.get("C:\\Users\\Divya\\Desktop\\Code\\Projects_Divya\\Core-Java\\CoreJava\\src\\com\\divya\\io\\NIOTest.java");

      try{
         checkAttribute(src);
         checkAttribute(classFile);
         checkAttribute(target);
         checkAttribute(src1);
         checkAttribute(target1);
         Files.copy(src1, target1,
                 StandardCopyOption.COPY_ATTRIBUTES);
       //  Files.copy(src, target,
         //        StandardCopyOption.REPLACE_EXISTING);
         System.out.println("root="+src.getRoot());
         System.out.println("filename="+src.getFileName());
         System.out.println("fileSystem="+src.getFileSystem());
         System.out.println("parent="+src.getParent());
         Path relativPath= src.relativize(target);
         System.out.println("Path relativePath="+ src.relativize(target));

      }
      catch (IOException ex) {
         System.err.format("I/O Error when copying file"+ex);
      }

   }

   public void checkAttribute(Path path) throws IOException{
      System.out.println("-----------path is -------------"+path);
      System.out.println("Files.isExecutable(path)"+Files.isExecutable(path));
      System.out.println("Files.isReadable(path)"+Files.isReadable(path));
      System.out.println("Files.isWritable(path)"+Files.isWritable(path));

      System.out.println("Files.isDirectory(path)"+Files.isDirectory(path));
      System.out.println("Files.isRegularFile(path)"+Files.isRegularFile(path));
      System.out.println("Files.isSymbolicLink(path)"+Files.isSymbolicLink(path));
      System.out.println("Files.isHidden(path)"+Files.isHidden(path));
      long epoch = Files.getLastModifiedTime(path).toMillis();
      System.out.println(epoch);
      ZonedDateTime zdt= FileTime.fromMillis(epoch).toInstant().atZone(ZoneId.of("Asia/Kolkata"));
      System.out.println("zdt=="+zdt);
   }

}
