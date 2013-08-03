package com.nadeem.app.dsa.adt.impl;

import com.nadeem.app.dsa.adt.OrderedList;
import com.nadeem.app.dsa.iterator.Iterator;

public class SortedCircularLinkedList<E extends Comparable<E>> implements OrderedList<E> {

	private Node<E> head;
	private int count = 0;

	private static class Node<E> {
		private E data;
		private Node<E> next;
		public Node(E newData) {
			this.data = newData;
		}
	}

	public boolean add(E element) {
		if (shouldInsertDataAsHead()) {
			this.head = new Node<E>(element);
			this.head.next = head;			
		} else if (shouldInsertDataBeforeHead(element)) {
			Node<E> lastNode = lastNode();
			Node<E> newNode = new Node<E>(element);
			newNode.next = this.head.next;
			lastNode.next = newNode;
			this.head = newNode;			
		}
		this.count++;
		return true;
	}

	private boolean shouldInsertDataAsHead() {
		return null == this.head;
	}

	private boolean shouldInsertDataBeforeHead(E element) {
		return this.head.data.compareTo(element) > 0;
	}

	private Node<E> lastNode() {
		Node<E> temp = this.head;
		while (temp.next != this.head) {
			temp = temp.next;
		}
		return temp;
	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public boolean contains(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeFirst() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeLast() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<E> getIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
