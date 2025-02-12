import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            MyRemote obj = new MyRemoteImpl();
            LocateRegistry.createRegistry(2000);
            Naming.rebind("rmi://localhost:2000/myservice", obj);

            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            System.out.println("Server error: " + e);
        }
    }
}
