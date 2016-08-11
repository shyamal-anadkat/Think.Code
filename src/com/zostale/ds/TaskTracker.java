package com.zostale.ds;


public class TaskTracker {


	public static void main(String[] args) {

		String tasks[] = {"clean","study","sing"};
		SexyQueue<Object> tq = new TaskQueue<Object>();
		for (int i = 0; i < tasks.length; i++) {
			tq.enqueue(tasks[i]);
		}
		tq.addToMap();
		tq.printTasks();
	}



}
