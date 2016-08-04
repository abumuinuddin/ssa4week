package gov.ssa.iron.yard;

import java.util.EmptyStackException;

public class MyStack {
    private int[] stackArr = new int[0];
    
    public void push(int value) {
        int[] tmpArr = new int[(stackArr.length + 1)];
        for(int i = 0; i < stackArr.length && stackArr.length > 0; i++) {
            tmpArr[i] = stackArr[i];
        }
        tmpArr[stackArr.length] = value;
        stackArr = tmpArr;
    }
    
    public int pop() throws EmptyStackException {
        if(stackArr.length == 0) {
            throw(new EmptyStackException());
        }
        int rtnValue = stackArr[(stackArr.length-1)];
        int[] tmpArr = new int[(stackArr.length-1)];
        for(int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = stackArr[i];
        }
        stackArr = tmpArr;
        return rtnValue;
    }
    
    public void displayInternalStack() {
        System.out.print("Internal Stack=[");
        for(int i = 0; i < stackArr.length; i++) {
            System.out.print(" " + stackArr[i] + ",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for(int i = 0; i < args.length; i++) {
            myStack.push(Integer.parseInt(args[i]));
            System.out.println("pushing value " + args[i]);
            myStack.displayInternalStack();
        }
        // pop them off the stack
        for(int i = 0; i < args.length; i++) {
            System.out.println("popping value " + myStack.pop());
            myStack.displayInternalStack();
        }
    }

}