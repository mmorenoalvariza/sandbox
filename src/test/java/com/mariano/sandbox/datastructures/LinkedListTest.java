package com.mariano.sandbox.datastructures;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LinkedListTest {
    @Test
    public void testRemoveLast()
    {
        LinkedList<String> ll = new SingleLinkedList<>();
        ll.add("foo");
        ll.add("bar");
        ll.add("baz");
        ll.add("foobar");
        String baz = ll.removeLast();
        System.out.println(baz);
    }

    @Test
    public void testReverse() {
        LinkedList<String> ll = new SingleLinkedList<>();
        ll.add("foo");
        ll.add("bar");
        ll.add("baz");
        ll.add("foobar");
        System.out.println(ll);
        System.out.println(ll.reverse());
    }
    @Test
    public void testRemoveValue()
    {
        LinkedList<String> ll = new SingleLinkedList<>();
        ll.add("foo");
        ll.add("bar");
        ll.add("baz");
        ll.add("foobar");
        ll.remove("baz");
        System.out.println(ll);
    }
    @Test
    public void testRemoveDuplicates(){
        LinkedList<String> ll = new SingleLinkedList<>();
        ll.add("foo");
        ll.add("bar");
        ll.add("baz");
        ll.add("foo");
        ll.add("fizbuz");
        ll.add("bar");
        ll.add("foobar");
        ll.removeDuplicates();
        System.out.println(ll);
    }
    @Test
    public void testGetKthValue(){
        LinkedList<String> ll = new SingleLinkedList<>();
        ll.add("foo");
        ll.add("bar");
        ll.add("baz");
        ll.add("pazz");
        ll.add("fizbuz");
        ll.add("lars");
        ll.add("foobar");
        assertThat(ll.getKthToLastElement(0), is("foobar"));
        assertThat(ll.getKthToLastElement(1), is("lars"));
        assertThat(ll.getKthToLastElement(4), is("baz"));
    }
    @Test
    public void testPartition(){
        LinkedList<Integer> ll = new SingleLinkedList<>();
        ll.add(3);
        ll.add(5);
        ll.add(8);
        ll.add(5);
        ll.add(10);
        ll.add(2);
        ll.add(1);
        System.out.println(ll);
    }
}
