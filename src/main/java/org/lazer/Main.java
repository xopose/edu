package org.lazer;

import org.lazer.resources.*;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        int i;
        try(var fin = new FileInputStream("src/main/java/org/lazer/files/input");
            var fout = new FileOutputStream("src/main/java/org/lazer/files/output")) {
            do{
                i = fin.read();
                if (i != -1) fout.write(i);
            }while (i != -1);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}