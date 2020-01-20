package multiThreading;

class MyThread extends Thread {
	public void run() {
		super.run();
		for (int i = 0; i <= 10; i++) {
			System.out.print(i+"   ");
		try {
			Thread.sleep(450);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();

	}

}
