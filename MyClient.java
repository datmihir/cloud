import java.rmi.*;

public class MyClient {
    public static void main(String args[]) {
        String value = "Java RMI";
        try {
            MyRemote stub = (MyRemote) Naming.lookup("rmi://localhost:2000/myservice");
            String response = stub.getMessage(value);

            System.out.println("Search result for '" + value + "': " + response);
        } catch (Exception e) {
            System.out.println("Client error: " + e);
        }
    }
}
