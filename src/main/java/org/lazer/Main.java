package org.lazer;

import org.lazer.box.Box;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(100, 20, 42.5);
        System.out.println(box1.depth * box1.width * box1.height);
    }
}