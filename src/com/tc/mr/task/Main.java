package com.tc.mr.task;

public class Main {

	public static void main(String[] args) {
		Task task1 = new Task("Walk the dog");
		Task task2 = new Task("Feed the dog");
		Task task3 = new Task("Send the child to school");
		Task task4 = new Task("Come to work");
		Task task5 = new Task("Try not to kill anyone at work");
		Task task6 = new Task("Come back home");

		QueueTask turn = new QueueTask();
		turn.setTask(task1);
		turn.setTask(task2);
		turn.setTask(task3);
		turn.setTask(task4);
		turn.setTask(task5);
		turn.setTask(task6);

		Thread John = new Thread(new FirstManager(turn, "Manager John"));
		Thread Bill = new Thread(new SecondManager(turn, "Manager Bill"));
		Thread Michael = new Thread(new ThirdManager(turn, "Manager Michael"));

		John.start();
		try {
			John.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Bill.start();
		try {
			Bill.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Michael.start();
		try {
			Michael.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
