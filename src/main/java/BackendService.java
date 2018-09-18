import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BackendService extends Remote {

    List<String> getListaBarrios() throws RemoteException;
    List<String> getListaComidas() throws RemoteException;
}
