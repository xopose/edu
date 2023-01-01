package org.lazer;

import org.lazer.resources.Box;
import org.lazer.resources.Stack;
import org.lazer.resources.Weight;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack(3);
        stk.push(2);
        stk.push(2);
        stk.push(2);
        stk.push(5);
        stk.push(2);
        stk.push(2);
        stk.push(2);
        for (int i =0; i< stk.getLenght(); i++){
            System.out.println(stk.pop());
        }
        stk.clear();
        for (int i =0; i< stk.getLenght(); i++){
            System.out.println(stk.pop());
        }
        System.out.println(stk.getLenght());
    }
}