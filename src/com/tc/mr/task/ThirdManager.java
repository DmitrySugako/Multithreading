package com.tc.mr.task;

public class ThirdManager implements Runnable {

	private QueueTask pbQ;
	private String name;

	public ThirdManager(QueueTask q, String n) {
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
