package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int RETURN_MINUS_ONE = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    // TODO: W zaimplementowanej strukturze listy funkcja zawsze zwraca false, więc jest zbędna
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return RETURN_MINUS_ONE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return RETURN_MINUS_ONE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
