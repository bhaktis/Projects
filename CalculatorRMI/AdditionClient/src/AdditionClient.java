import java.rmi.Naming;
import java.rmi.RMISecurityManager;


public class AdditionClient {
	public static void main (String[] args) {
		AdditionInterface hello;
		
		try{
			System.setSecurityManager(new RMISecurityManager());
			
			hello = (AdditionInterface)Naming.lookup("rmi://localhost/ABC");
			int result = hello.add(9, 10);
			
		}catch(Exception e){
			System.out.println("helo Client Exception " + e.getMessage());
		}
	}
}
