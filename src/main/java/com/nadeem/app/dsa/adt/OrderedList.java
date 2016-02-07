package com.nadeem.app.dsa.adt;

public interface OrderedList<E extends Comparable<? super E>> extends List<E> {
	boolean add(E element);
}
