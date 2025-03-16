package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node last;
    int value;

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
            return -1;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
