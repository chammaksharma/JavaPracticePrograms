
public class ThreadsExtendingThreadClass1 extends Thread{

	
	ThreadsExtendingThreadClass1(){
	}
	
	ThreadsExtendingThreadClass1(String threadName){
		super(threadName);
		System.out.println(this + "  prints first");
		start();
	}
	public void run() {
		//Display info about this particular thread
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new ThreadsExtendingThreadClass1(), "thread1");
		Thread thread2 = new Thread(new ThreadsExtendingThreadClass1(), "thread2");
		//	    The below 2 threads are assigned default names
		Thread thread3 = new ThreadsExtendingThreadClass1();
		Thread thread4 = new ThreadsExtendingThreadClass1();
		Thread thread5 = new ThreadsExtendingThreadClass1("thread5");
		//Start the threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		try {
			//The sleep() method is invoked on the main thread to cause a one second delay.
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
				}
				//Display info about the main thread
			//	System.out.println(Thread.currentThread());
			
	}
}
