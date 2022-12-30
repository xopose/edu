package org.lazer;

import org.lazer.resources.Box;
import org.lazer.resources.Stack;
import org.lazer.resources.Weight;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack(10);
        Box box1 = new Box();
        Box box2 = new Box(5, 7, 8);
        Box box3 = new Box(9);
        System.out.println(box1.vol());
        System.out.println(box2.vol());
        System.out.println(box3.vol());
        var myBox = new Weight(5, 7, 2, 6.35);
        myBox.print();
    }
}