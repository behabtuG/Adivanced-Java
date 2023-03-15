package RemoteMethodInvocationRMI;

import java.rmi.*;

// Creating a Search interface
public interface Search extends Remote {

    // Declaring the method prototype
    public String query(String search) throws RemoteException;
}
