
public class ThreadsRunnableInterface1 implements Runnable{

	Thread runner;
	public ThreadsRunnableInterface1(){
		
	}
	
	public ThreadsRunnableInterface1(String threadName){
		runner = new Thread(this,threadName);	//create new thread
		System.out.println(runner.getName());
		System.out.println(Thread.currentThread());
	}
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"test"); //display info about current thread	
	}
	
	public static void main(String args[]){
		
		//Display info about the main thread
		//System.out.println(Thread.currentThread());

		Thread thread1 = new Thread(new ThreadsRunnableInterface1(),"thread1");
		Thread thread2 = new Thread(new ThreadsRunnableInterface1(),"thread2");
		ThreadsRunnableInterface1 thread3 = new ThreadsRunnableInterface1("thread3");
		
		//Start the threads
				thread1.start();
				thread2.start();			
				try {
					Thread.currentThread().sleep(1000);
					//delay for one second
				} catch (InterruptedException e) {
				}
				//Display info about the main thread
				System.out.println(Thread.currentThread());
	}

}
