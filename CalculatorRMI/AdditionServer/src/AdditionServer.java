import java.rmi.Naming;
import java.rmi.RMISecurityManager;


@SuppressWarnings("deprecation")
public class AdditionServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.setSecurityManager(new RMISecurityManager());
			
			Addition hello = new Addition();
			Naming.rebind("rmi://localhost/ABC", hello);
			
			System.out.println("Addition server is ready");
			
		}catch(Exception e){
			System.out.println("Addition server failed " + e.getMessage());
		}

	}

}
