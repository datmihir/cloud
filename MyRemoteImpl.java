import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    MyRemoteImpl() throws RemoteException {
        super();
    }
    @Override
    public String getMessage(String name) throws RemoteException {
        if (name.equalsIgnoreCase("Java RMI")) {
            return "Found";
        } else {
            return "Not Found";
        }
    }
}
