package org.lazer;

import org.lazer.resources.*;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        System.out.println("Ввод");
        String c;
        do{
            c = br.readLine();
            System.out.println(c);
        }
        while (!c.equals("aaaa"));
    }
}