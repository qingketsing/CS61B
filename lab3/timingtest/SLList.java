package timingtest;

/** An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within. */
public class SLList<Item> {
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

	/** Creates an empty timingtest.SLList. */
	public SLList() {//首结点一定为空，称之为哨兵结点
		sentinel = new IntNode(null, null);
		size = 0;
	}

	public SLList(Item x) {//首结点为空的情况
		sentinel = new IntNode(null, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	/** Adds x to the front of the list. */
	public void addFirst(Item x) {
		sentinel.next = new IntNode(x, sentinel.next);//插入结点
		size = size + 1;
	}

	/** Returns the first item in the list. */
	public Item getFirst() {
		return sentinel.next.item;
	}

	/** Adds x to the end of the list. */
	public void addLast(Item x) {
		size = size + 1;

		IntNode p = sentinel;

		/* Advance p to the end of the list. */
		while (p.next != null) {
			p = p.next;
		}//迭代到最后一个结点

		p.next = new IntNode(x, null);
	}

	/** returns last item in the list */
	public Item getLast() {
		IntNode p = sentinel;

		/* Advance p to the end of the list. */
		while (p.next != null) {
			p = p.next;
		}

		return p.item;
	}


	/** Returns the size of the list. */
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		/* Creates a list of one integer, namely 10 */
		SLList L = new SLList();
		L.addLast(20);
		System.out.println(L.size());
	}
}
