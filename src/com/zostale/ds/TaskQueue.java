package com.zostale.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * 
 * @author Shyamal Anadkat
 *
 * @param <E>
 */
public class TaskQueue<E> implements SexyQueue<Task> {
	LinkedList<Task> task;
	private static HashMap<Integer, Task> taskMap;

	public TaskQueue() {
		this.task = new LinkedList<Task>();
	}

	public void enqueue(Task item) {
		this.task.addLast(item);
	}

	public Task dequeue() {
		Task obj = this.task.getFirst();
		this.task.removeFirst();
		return obj;
	}

	public Task peek() {
		return this.task.getFirst();
	}

	public int size() {
		return this.task.size();
	}

	public boolean isEmpty() {
		return this.task.isEmpty();
	}

	public HashMap<Integer,Task> addToMap() {
		if(task.isEmpty()) return null;
		taskMap= new HashMap<Integer, Task>();
		for(int i = 0; i < task.size(); i++) {
			taskMap.put(i,task.get(i));
		}
		return taskMap;
	}

	public void printTasks() {
		if(task.isEmpty()) {
			System.out.println("No tasks found.");
		}
		else {
			List<Integer> keys = new ArrayList<Integer>(taskMap.keySet());
			Collections.sort(keys);
			System.out.println("##########TASK LIST##########\n");
			for(int key: keys) {
				System.out.println(key+1 + ": " + taskMap.get(key).getDescription()+" || isDone: "+ taskMap.get(key).isDone
						+" || Important: "+taskMap.get(key).isImportant);
				System.out.println("-----------------------------------------------------------------------");
			}

		}
	}
}
