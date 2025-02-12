import java.rmi.*;

public class MyClient {
    public static void main(String args[]) {
        String value = "Java RMI";
        try {
            // Lookup the remote object
            MyRemote stub = (MyRemote) Naming.lookup("rmi://localhost:2000/myservice");

            // Call remote method
            String response = stub.getMessage(value);

            // Print the response
            System.out.println("Search result for '" + value + "': " + response);
        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}
