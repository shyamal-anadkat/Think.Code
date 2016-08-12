package com.zostale.ds;

/**
 * 
 * @author Shyamal Anadkat
 * Interface for TaskQueue 
 * @param <E>
 */
public interface SexyQueue<E> {
	void enqueue(Task item);
	Task dequeue();
	Task peek();
	int size();
	boolean isEmpty();
	Object addToMap();
	void printTasks();
}
