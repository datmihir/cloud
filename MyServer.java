import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            // Create remote object
            MyRemote obj = new MyRemoteImpl();

            // Start RMI Registry on port 2000
            LocateRegistry.createRegistry(2000);

            // Bind the remote object to the registry
            Naming.rebind("rmi://localhost:2000/myservice", obj);

            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}
