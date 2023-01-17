package com.tc.mr.task;

import java.util.ArrayDeque;


public class QueueTask {

	private ArrayDeque<Task> queue = new ArrayDeque<Task>();
	
	
	public Task getTask() {
		return queue.poll();
	}

	public void setTask(Task task) {
		queue.add(task);

	}

	public int queueSize() {
		return queue.size();
	}
	
	
}
