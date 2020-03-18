package com.bayareala8s.MinItemStack;

import java.util.Stack;

public class MinItemStack {

    //this is the original stack
    private Stack<Integer> mainStack;
    //this stack is just for tracking the minimum item
    private Stack<Integer> minStack;

    public MinItemStack() {
        this.mainStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int item) {

        //push the new item onto the stack
        mainStack.push(item);

        //first item is the same in both stacks
        if(mainStack.size() == 1) {
            minStack.push(item);
            return;
        }

        //if the item is the largest one so far: we insert it onto the stack
        if(item < minStack.peek()) {
            minStack.push(item);
        } else {
            //if not the smallest one then we duplicate the smallest one on the minStack
            minStack.push(minStack.peek());
        }
    }

    //when removing an item we remove it from both stacks
    public int pop() {
        minStack.pop();
        return mainStack.pop();
    }

    //min item is the last item we have inserted into the maxStack O(1)
    public int getMinItem() {
        return minStack.peek();
    }
}
