import java.rmi.*;

public interface MyRemote extends Remote {
    public String getMessage(String name) throws RemoteException;
}
