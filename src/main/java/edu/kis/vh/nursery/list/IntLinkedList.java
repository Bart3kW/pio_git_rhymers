package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int ERROR = -1;

    private Node last;
    private int value;

    public void push(int newValue) {
        if (getLast() == null)
            setLast(new Node(newValue));
        else {
            getLast().setNext(new Node(newValue));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERROR;
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return ERROR;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

	private int getValue() {
		return value;
	}



	private Node getLast() {
		return last;
	}

	private void setLast(Node last) {
		this.last = last;
	}

}
