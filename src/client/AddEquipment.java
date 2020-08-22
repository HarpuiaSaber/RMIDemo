package client;

import controller.EquipmentService;
import model.Equipment;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AddEquipment {
    public static void main(String[] args) {
        try {
            EquipmentService equipmentService = (EquipmentService) Naming.lookup(HostInformation.host);
            System.out.println(equipmentService.add(new Equipment()));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
