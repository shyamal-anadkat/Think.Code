package com.zostale.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;


public class TaskQueue<E> implements SexyQueue<Object> {
	LinkedList<Object> task;
	private static HashMap<Integer, Object> taskMap;

	public TaskQueue() {
		this.task = new LinkedList<Object>();
	}

	public void enqueue(Object item) {
		this.task.addLast(item);
	}

	public Object dequeue() {
		Object obj = this.task.getFirst();
		this.task.removeFirst();
		return obj;
	}

	public Object peek() {
		return this.task.getFirst();
	}

	public int size() {
		return this.task.size();
	}

	public boolean isEmpty() {
		return this.task.isEmpty();
	}


	public Object addToMap() {
		taskMap= new HashMap<Integer, Object>();
		if(task.isEmpty()) return null;
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
			for(int key: keys) {
				System.out.println(key + ": " + taskMap.get(key));
			}
		}
	}
}
