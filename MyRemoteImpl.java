import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    // Constructor
    MyRemoteImpl() throws RemoteException {
        super();
    }

    // Implementing the remote method
    @Override
    public String getMessage(String name) throws RemoteException {
        if (name.equalsIgnoreCase("Java RMI")) {
            return "Found";
        } else {
            return "Not Found";
        }
    }
}
