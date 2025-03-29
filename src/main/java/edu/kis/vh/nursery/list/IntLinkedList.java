package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int ERROR = -1;

    private Node last;
    private int value;

    public void push(int newValue) {
        if (last == null)
            last = new Node(newValue);
        else {
            last.next = new Node(newValue);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERROR;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
