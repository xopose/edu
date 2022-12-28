package org.lazer;

import org.lazer.resources.Box;
import org.lazer.resources.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(10);
        stk.push(9);
        stk.push(8);
        stk.push(7);
        stk.push(6);
        stk.push(5);
        stk.push(4);
        System.out.println(stk.pop() + " " + stk.pop() + " " + stk.pop() + " " + stk.pop() + " " + stk.pop() + " " + stk.pop() + " " + stk.pop());
    }
}