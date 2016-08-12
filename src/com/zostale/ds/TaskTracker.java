package com.zostale.ds;

/**
 * 
 * @author Shyamal Anadkat
 *
 */
public class TaskTracker {
	
	public static void main(String[] args) {

		Task t1 = new Task(true,true,"Party and then clean");
		Task t2 = new Task(false,true,"Sleep all day");
		Task t3 = new Task(false,false,"Study all night");
		Task t4 = new Task(false,true,"Call a friend.");
		
		
		SexyQueue<Task> tq = new TaskQueue<Task>();
		tq.enqueue(t1);
		tq.enqueue(t2);
		tq.enqueue(t3);
		tq.enqueue(t4);
		
		tq.addToMap();
		tq.printTasks();
		//System.out.println(tq.size());
		
	}
}
