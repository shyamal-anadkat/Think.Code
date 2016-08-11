package com.zostale.ds;


public interface SexyQueue<E> {
	void enqueue(E item);
	E dequeue();
	E peek();
	int size();
	boolean isEmpty();
	Object addToMap();
	void printTasks();
}
