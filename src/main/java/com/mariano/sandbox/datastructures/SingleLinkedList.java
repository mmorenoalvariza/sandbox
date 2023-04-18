package com.mariano.sandbox.datastructures;

import javax.el.MethodNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

public class SingleLinkedList<T extends Comparable> implements LinkedList<T> {
    private Node<T> firstNode;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node(value);
        if (this.firstNode == null) {
            this.firstNode = newNode;
        } else {
            Node<T> lastNode = this.firstNode;
            while (lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode = newNode;
        }
    }

    @Override
    public void add(int index, T value) {
    }

    @Override
    public T remove(int index) {
        // TODO check for valid index
        Node<T> currentNode = this.firstNode;
        for(int i = 0; i<index-1; i++){
            if (currentNode == null)
            {
                throw new IndexOutOfBoundsException();
            }
            currentNode = currentNode.nextNode;
        }
        T value = currentNode.nextNode.value;
        currentNode.nextNode = null;
        return value;
    }

    @Override
    public void remove(T value) {
        Node<T> currentNode = this.firstNode;
        if(currentNode.value.equals(value))
        {
            this.firstNode = currentNode.nextNode;
            return;
        }
        while(!value.equals(currentNode.nextNode.value))
        {
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = currentNode.nextNode.nextNode;
    }

    @Override
    public T removeLast() {
        Node<T> lastNode = this.firstNode;
        if (lastNode == null) {
            throw new NoSuchElementException("The list is empty already");
        }
        if (lastNode.nextNode == null) {
            T value = this.firstNode.value;
            this.firstNode = null;
            return value;
        }
        while (lastNode.nextNode.nextNode != null) {
            lastNode = lastNode.nextNode;
        }
        T value = lastNode.nextNode.value;
        lastNode.nextNode = null;
        return value;
    }

    @Override
    public void removeDuplicates() {
        Node<T> currentNode = this.firstNode;
        if (currentNode == null) return;
        Map<T, Boolean> valueMap = new HashMap<>();
        valueMap.put(currentNode.value, true);

        while(currentNode.nextNode != null)
        {
            T currentValue = currentNode.nextNode.value;
            Boolean isElementPresent = valueMap.get(currentValue);
            if(isElementPresent == null)
            {
                valueMap.put(currentValue, true);
            } else
            {
                currentNode.nextNode = currentNode.nextNode.nextNode;
            }
            currentNode = currentNode.nextNode;
        }
    }

    @Override
    public int size() {
        throw new MethodNotFoundException();
    }

    @Override
    public T getKthToLastElement(int kth) {
        Node<T> currentElement = this.firstNode;
        Stack<T> valueStack = new Stack<>();
        valueStack.push(currentElement.value);
        while (currentElement.nextNode != null)
        {
            currentElement =currentElement.nextNode;
            valueStack.push(currentElement.value);
        }
        T kthValue = valueStack.pop();
        for(int i = 0; i<kth; i++)
        {
           kthValue = valueStack.pop();
        }
        return kthValue;
    }
    @Override
    public LinkedList<T> reverse() {
        Node<T> head = this.firstNode;
        Node<T> next = head.nextNode;
        head.nextNode = null;
        Node<T> previous = head;
        while (next != null)
        {
            Node<T> nextSig = next.nextNode;

            next.nextNode = previous;
            previous = next;
            next = nextSig;
        }
        this.firstNode = previous;
        return this;
    }

    @Override
    public LinkedList<T> partitionByValue(T value) {
        // TODO Fix
        Node<T> nodeForValue = getNodeByValue(value);
        Node<T> tempNode = this.firstNode;
        Node<T> returnNode = this.firstNode;
        while(tempNode != null)
        {
            //if(returnNode.value.compareTo(tempNode.value) > 0)
            //{
             //7   returnNode = tempNode;
            //}
            Node<T> nextNode = tempNode.nextNode;
            if ( tempNode.value.compareTo(value) < 0) {
                tempNode.nextNode = nodeForValue;
            }
            if( tempNode.value.compareTo(value) > 0) {
                nodeForValue.nextNode = tempNode;
            }
            tempNode = nextNode;

        }
        return this;
    }

    private Node<T> getNodeByValue(T value) {
        Node<T> nodeForValue = this.firstNode;
        while (nodeForValue.value != value)
        {
            nodeForValue = nodeForValue.nextNode;
        }
        return nodeForValue;
    }

    @Override
    public String toString() {
        return firstNode.toString();
    }

    class Node<T> {
        private T value;
        private Node<T> nextNode;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "["+ value+ " | * ] --> "+nextNode;
        }
    }
}
