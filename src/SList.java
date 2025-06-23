/*
 * Total Marks SList Class: 26 Marks
 */
public class SList<T extends Comparable<T>> implements IList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;
	private Integer size = 0;
	
	/**
	 * Default constructor
	 */
	public SList() {}
	
	/**
	 * returns the first node in the list.
	 */
	public Node<T> first() {
		return head;
	}
	
	/**
	 * returns the last node in the list.
	 */
	public Node<T> last() {
		return tail;
	}
	
	/**
	 * returns the node before a given node in the list.
	 * 3 marks
	 */
	@Override
	public Node<T> prev(Node<T> node) {
		if (node == head) return null;
		 Node<T> current = head;
		 while (current != null && current.getNext() != node) {
		 current = current.getNext();
		 }
		 return current;
	}
	
	/**
	 * returns the next node after a given node in the list.
	 */
	@Override
	public Node<T> next(Node<T> node) {
		return node.getNext();
	}
	
	/**
	 * Replace the element of a given node in the list
	 * @return the old element of the given node
	 * 1 Marks
	 */
	@Override
	public T replace(Node<T> node, T item) {
		T oldItem = node.getElement();
		 node.setElement(item);
		 return oldItem;
	}
	
	/**
	 * Add an element after a given node in the list
	 * 3 Marks
	 */
	@Override
	public Node<T> addAfter(Node<T> node, T item) {
		Node<T> newNode = new Node<>(node.getNext(), item);
		 node.setNext(newNode);
		 if (node == tail) {
		 tail = newNode;
		 }
		 size++;
		 return newNode;
	}

	/**
	 * Add an element before a given node in the list
	 * 5 Marks
	 */
	@Override
	public Node<T> addBefore(Node<T> node, T item) {
		Node<T> newNode = new Node<>(node, item);
		 Node<T> prevNode = prev(node);
		 if (prevNode == null) {
		 head = newNode;
		 } else {
		 prevNode.setNext(newNode);
		 }
		 size++;
		 return newNode;
	}

	/**
	 * Add an element to the start of the list
	 * @return the new node
	 */
	public Node<T> addFirst(T item) {
		Node<T> newNode = new Node<T>(head, item);
		head = newNode;
		if (isEmpty())
			tail = head;
		size++;
		return newNode;	
	} 

	/**
	 * Add an element to the end of the list
	 * @return the new node
	 */
	public Node<T> addLast(T item){
		Node<T> newest = new Node<T>(null, item);
		if (isEmpty())
		  head = newest;
		else
		  tail.setNext(newest);
		tail = newest;
		size++;
		return newest;
	}
	/*
	 * Alternate implementation (is actually wrong))
	public Node<T> addLast(T item){
		//TODO: Complete
		return addAfter(tail, item);
	}*/
	
	/**
	 * Remove a specified node from the list. The removed element is returned
	 * 5 Marks
	 */
	@Override
	public T remove(Node<T> node) {
		if (node == head) {
			 head = head.getNext();
			 if (head == null) {
			 tail = null;
			 }
			 } else {
			 Node<T> prevNode = prev(node);
			 prevNode.setNext(node.getNext());
			 if (node == tail) {
			 tail = prevNode;
			 }
			 }
			 size--;
			 return node.getElement();
	}

	/**
	 * Returns the node that contains the element that is specified as a parameter
	 * 5 Marks
	 */
	@Override
	public Node<T> search(T elem) {
		Node<T> current = head;
		 while (current != null) {
		 if (current.getElement().compareTo(elem) == 0) {
		 return current;
		 }
		 current = current.getNext();
		 }
		 return null;
	}

	/**
	 * Returns true if the list is empty
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Return the size of the list
	 */
	@Override
	public Integer size() {
		return size;
	}
	
	/**
	 * The overridden method for displaying items in the Singly-Linked List
	 * format: <e1><-><e2><-><e3><->
	 * 4 Marks
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		 Node<T> currentNode = head;
		 while (currentNode != null) {
		 result.append(currentNode.toString());
		 if (currentNode.getNext() != null) {
		 result.append("<->");
		 }
		 currentNode = currentNode.getNext();
		 }
		 return result.toString();
		 
	}

	@Override
	public Node<T> insertAfter(Node<T> node, T item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<T> insertBefore(Node<T> node, T item) {
		// TODO Auto-generated method stub
		return null;
	}
}
