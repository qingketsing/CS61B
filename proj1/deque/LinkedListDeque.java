package deque;

import jh61b.junit.In;

public class LinkedListDeque<Item> {

    public class IntNode {
        public Item item;
        public IntNode next;
        public IntNode(Item i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* The first item (if it exists) is at sentinel.next. */
    public IntNode sentinel;
    private int size;
    public LinkedListDeque() {//首结点一定为空，称之为哨兵结点
        sentinel = new IntNode(null, null);
        size = 0;
    }

    public int size() {
        return size;
    }
    public void addFirst(Item data){
        sentinel.next = new IntNode(data,sentinel.next);
        size += 1;
    }

    public void addLast(Item data){
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(data,p.next);
        size += 1;
    }

    public boolean isEmpty(){
        return sentinel.next == null && size == 0;
    }

    public void printDeque(){
        IntNode p = sentinel;
        while(p != null){
            System.out.println(p.item+" ");
            p = p.next;
        }
    }

    public Item removeFirst(){
        if(sentinel.next == null){
            return null;
        }
        IntNode p = sentinel.next;
        sentinel.next = sentinel.next.next;
        size = size-1;
        return p.item;
    }

    public Item removeLast(){
        if(sentinel.next == null){
            return null;
        }
        IntNode p = sentinel;
        while(p.next.next != null){
            p = p.next;
        }
        IntNode p1 = p.next;
        size = size-1;
        p.next = p.next.next;
        return p1.item;
    }

    public Item getLast(){
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        return p.item;
    }

    public Item get(int i){
        IntNode p = sentinel;
        while(i != 0){
            p = p.next;
            i--;
        }
        return p.next.item;
    }

}
