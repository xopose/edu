package org.lazer;

import org.lazer.resources.*;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        int c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        System.out.println("Ввод");

        do{
            c = (int) br.read();
            System.out.println(c);
        }
        while (c!='`');
    }
}