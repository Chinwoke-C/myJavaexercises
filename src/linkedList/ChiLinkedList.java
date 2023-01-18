package linkedList;

import java.util.Objects;

public class ChiLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public String addFirst(String value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = head;
        size++;

        return head.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String addLast(String value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
        tail = tail.next;
        }
        size++;

        return tail.element;
    }

    public String insert(int index, String value) {
        if (index == 0) addFirst(value);
        else if (index >= size) {
            addLast(value);
        }
        else {
            Node current = head;
            for (int i = 1; i < index ; i++) {
                current = current.next;
                Node temp = current.next;
                current.next = new Node(value);
                (current.next).next = temp;
            }
        }

        return value;
    }
    public int entries(){
        return this.size;
    }

    public String getValueByIndex(int index) {
        Node current = head;
        for (int i = 0; i < index ; i++) {
            current = current.next;

        }

        return current.element;
    }

    public int getIndexByValue(String value) {
        Node current = head;
        for (int i = 0; i < size ; i++) {
            if (current.element.equals(value)) return i;
            current = current.next;
        }

        return -1;
    }

    public void remove() {
        size = 0;
        head = tail = null;
    }

    class Node {
        private String element;
        private Node next;

        public Node(String element) {
            this.element = element;
        }
    }
}
