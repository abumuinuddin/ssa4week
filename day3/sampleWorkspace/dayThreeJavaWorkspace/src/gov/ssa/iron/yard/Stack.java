package gov.ssa.iron.yard;

public class Stack {
    private int[] store;
    private int len;

    public Stack() {
        this.store = new int[10];
        this.len = 0;
    }

    public void push(int a) {

    }

    public int pop() {

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        for (int i = 0; i < 50; i++) {
            st.push(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(st.pop());
        }
    }
} 