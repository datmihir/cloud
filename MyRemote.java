import java.rmi.*;

public interface MyRemote extends Remote {
    // Declaring the method prototype
    public String getMessage(String name) throws RemoteException;
}
