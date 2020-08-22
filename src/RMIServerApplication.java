import server.Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServerApplication {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1998);
            registry.rebind("Server", new Server());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
