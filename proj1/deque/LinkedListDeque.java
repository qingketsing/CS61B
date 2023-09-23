package deque;

public class LinkedListDeque<Item> {

    private class IntNode {
        public Item item;
        public IntNode next;

        public IntNode(Item i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* The first item (if it exists) is at sentinel.next. */
    private IntNode sentinel;
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


}
