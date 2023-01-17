package com.tc.mr.task;

public class SecondManager implements Runnable {

	private QueueTask pbQ;
	private String name;

	public SecondManager(QueueTask q, String n) {
		pbQ = q;
		name = n;
	}

	@Override
	public void run() {
		while (pbQ.queueSize() != 0) {
			synchronized (pbQ) {
				System.out.println(name + " completed the task: " + pbQ.getTask());

			}
		}
	}
}
