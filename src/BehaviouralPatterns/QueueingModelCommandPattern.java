package BehaviouralPatterns;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

interface Command_{
	public void execute();
}

class Task{
	private int id;
	public Task(int id) {
		this.id = id;
	}
	public void solveProblem() {
		System.out.println("Solving problem "+id);
	}
}

class TaskSolver implements Command_{
	
	private Task task;
	public TaskSolver(Task task) {
		this.task=task;
	}
	@Override
	public void execute() {
		task.solveProblem();
	}
	
}

class Algorithm{
	private BlockingQueue<Command_> commands;
	public Algorithm() {
		commands = new ArrayBlockingQueue<>(10);
	}
	
	public void produce() {
		try {
			for(int i=1;i<10;i++)
				commands.put(new TaskSolver(new Task(i)));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void consume() {
		try {
			for(int i=1;i<10;i++) {
				Thread.sleep(1000);
				commands.take().execute();
			}
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class QueueingModelCommandPattern {
	public static void main(String[] args) {
		Algorithm algorithm= new Algorithm();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				algorithm.produce();
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				algorithm.consume();
				
			}
		});
		
		t1.start();
		t2.start();
	}
}
