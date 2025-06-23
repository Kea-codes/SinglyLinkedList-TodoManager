
public interface IList<T extends Comparable<T>> {
	public Node<T> addAfter(Node<T> elem, T item);
	public Node<T> addBefore(Node<T> node, T item);
	public Node<T> addFirst(T item);
	public Node<T> addLast(T item);
	public T remove(Node<T> elem);
	public Node<T> search(T elem);
	public Node<T> first();
	
	
	public boolean isEmpty();
	public Integer size();
	/**
	 * returns the next node after a given node in the list.
	 */
	Node<T> next(Node<T> node);
	/**
	 * returns the node before a given node in the list.
	 * 3 marks
	 */
	Node<T> prev(Node<T> node);
	/**
	 * Replace the element of a given node in the list
	 * @return the old element of the given node
	 * 1 Marks
	 */
	T replace(Node<T> node, T item);
	/**
	 * Add an element after a given node in the list
	 * 3 Marks
	 */
	Node<T> insertAfter(Node<T> node, T item);
	/**
	 * Add an element before a given node in the list
	 * 5 Marks
	 */
	Node<T> insertBefore(Node<T> node, T item);
}
