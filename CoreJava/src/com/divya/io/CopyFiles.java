package com.divya.io;

import java.io.*;

public class CopyFiles {
    public static void main(String[] args) {
        String src = "C:\\Users\\Divya\\Desktop\\Code\\Projects_Divya\\Core-Java\\CoreJava\\src\\com\\divya\\Records\\abc";
        String dest = "C:\\Users\\Divya\\Desktop\\Code\\Projects_Divya\\Core-Java\\CoreJava\\src\\com\\divya\\Records\\CopyBike.txt";
        // copyWithFileReader(src,dest);//write using FileReader - one char at a time
        //  copyFileWithStream(src, dest);// write using FileInputStream - one char at a time
        //copyFileWithStreamUsingBuffer(src, dest);
        copyWithStreamReader(src,dest);//write using InputStreamReader - one char at a time
    }
    public static void copyWithStreamReader(String src, String dest) {
        try(InputStreamReader is= new InputStreamReader(new FileInputStream(src));
            OutputStreamWriter os= new OutputStreamWriter(new FileOutputStream(dest));
        ){
            int c;
        while((c=is.read())!=-1){
            is.skip(1);
            os.write(c);
        }
            System.out.println("copied");
    }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void copyFileWithStreamUsingBuffer(String src, String dest) {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest);) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len=fis.read(buffer)) != -1) {
                fis.skip(1);
                fos.write(buffer,0,len);

            }
            System.out.println("copied");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void copyFileWithStream(String src, String dest) {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest);) {
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
                fos.flush();
            }
            System.out.println("copied");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // copy a file with FileReader, it replaces the content if file already exist
    public static void copyWithFileReader(String src, String dest) {
        File f1 = new File(src);
        File f2 = new File(dest);
        try (FileReader file1 = new FileReader(f1); FileWriter file2 = new FileWriter(f2);) {
            int c;
            while ((c = file1.read()) != -1) {
                file2.write(c);

            }
            System.out.println("copied");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
