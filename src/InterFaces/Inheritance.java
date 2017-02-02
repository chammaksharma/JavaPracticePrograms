package InterFaces;

public class Inheritance {
	public static void main(String args[]) {
		// Super class reference variable can hold Sub Class instance
		Server server = new Tomcat();

		// we need to cast to get actual Server instance back in reference
		// variable.
		Tomcat tomcat = (Tomcat) server;
		//below statement gives error :: Type mismatch: cannot convert from Server to Tomcat
		//Tomcat tomcat =  server;
	
		tomcat.start(); // starting Server
		
		//Below will print :: Tomcat Server started Uptime of Server in nano: 1485888196141578000
		System.out.println("Uptime of Server in nano: " + server.uptime()); // starting Server);
		
		//Below will print :: Uptime of Server in nano:  casting test
		System.out.println("Uptime of Server in nano: " + ((Tomcat)server).uptime1()); 
		
		//Below both will print :: Uptime of Server in nano: 1485888287694664000
		System.out.println("Uptime of Server in nano: " + ((Tomcat)server).uptime());
		System.out.println("Uptime of Server in nano: " + server.uptime());
		
		tomcat.stop();
	}

}

class Server {
	private long uptime;

	public void start() {
		uptime = System.nanoTime();
	}

	public void stop() {
		uptime = 0;
	}

	public long uptime() {
		return uptime;
	}
}

class Tomcat extends Server {

	@Override
	public void start() {
		super.start();
		// Tomcat Server specific task
		System.out.println("Tomcat Server started");
	}

	@Override
	public void stop() {
		super.stop(); // you can call super class method using super keyword
		System.out.println("Tomcat Server Stopped");
	}
	
	public String uptime1() {
		return " casting test";
	}
}
