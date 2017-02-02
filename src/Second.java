
public class Second extends Thread{
	String msg;
	 First fobj;
	 Second (First fp,String str)
	 {
	  fobj = fp;
	  msg = str;
	  start();
	 }
	 public void run()
	 {
		 synchronized(fobj){
			 fobj.display(msg);
		 }
	 }
}
