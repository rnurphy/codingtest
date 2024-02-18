package codingtest.ct.week03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayQueue queue = new ArrayQueue(5);
		
		while (true) {
			System.out.println(String.format("현재 수: %d / %d", queue.size(), queue.capacity()));
			System.out.print("1. enq, 2. deq(poll), 3. peek, 4. clear, 5. dump, 0. 종료 ");
			
			int num = sc.nextInt();
			if (num == 0) {
				System.exit(0);
				break;
			}
			int x;
			switch (num) {
			case 1:
				System.out.print("데이터: ");
				x = sc.nextInt();
				queue.add(x);
				break;
			case 2:
				x = queue.poll();
				System.out.print("나간 데이터: " + x);
				break;
			case 3:
				x = queue.peek();
				System.out.print("첫번째 데이터: " + x);
				break;
			case 4:
				queue.clear();
				break;
			case 5:
				queue.dump();
				break;
			default:
				break;
			}
		}
		
	}
}

class ArrayQueue {
	private int max;		// 큐의 최대 용량
	private int front;		// 첫 번째 요소의 커서
	private int rear;		// 마지막 요소의 커서
	private int cnt;		// 현재 데이터의 수
	private int[] queue;	// 큐
	
	public ArrayQueue(int capacity) {
		this.max = capacity;
		this.cnt = this.front = this.rear = 0;
		
		try {
			this.queue = new int[this.max];
		} catch (Exception e) {
			this.max = 0;
		}
	}
	
	public int add(int x) {
		if (cnt >= max) {
			System.out.println("Queue is full.");
			return x;
		}
		
		queue[rear++] = x;
		cnt++;
		if (rear == max) {
			rear = 0;
		}
		return x;
	}
	
	public int peek() {
		if (cnt <= 0) {
			System.out.println("Queue is empty.");
		}
		return queue[front];
	}
	
	public int poll() {
		if (cnt <= 0) {
			System.out.println("Queue is empty.");
			return 0;
		}
		int x = queue[front++];
		cnt--;
		
		if (cnt < 0) cnt = 0;
		if (front == max) front = 0;
		
		return x;
	}
	
	public void clear() {
		this.rear = this.front = this.cnt = 0;
	}
	
	public boolean isEmpty() {
		return this.cnt <= 0;
	}
	
	public int capacity() {
		return this.max;
	}
	
	public boolean isFull() {
		return this.cnt >= this.max;
	}
	
	public int size() {
		return this.cnt;
	}
	
	public void dump() {
		if (cnt <= 0) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(Arrays.toString(queue));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
